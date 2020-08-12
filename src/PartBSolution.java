import java.util.*;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     *
     * @param url
     *            String that represents an URL that the user has visited
     * @param numVisits
     *            An int that represents the number of times that the user has
     *            visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     *
     * @return An int that represents the number of times that the user has visited
     *         the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     *
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times that we have visited the url
     *
     * @param updatedNumVisits
     *            int that represents the number that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }

}

public class PartBSolution {

    private static Queue<SiteStats> sites = new LinkedList<SiteStats>();
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {

       sortQueue(sites);
        List<SiteStats> topSites = new ArrayList<>();
        while (!sites.isEmpty() && n>0 )
        {
            topSites.add(sites.remove());
            n--;
        }
        System.out.println(topSites);
    }
    public static void sortQueue(Queue<SiteStats> sites)
    {
        for(int i = 0; i < sites.size(); i++)
        {
            int max_index = maxIndex(sites,sites.size() - i);
            insertMaxToRear(sites, max_index);
        }
    }
    public static int maxIndex(Queue<SiteStats> sites,int sort_index)
    {
        int s = sites.size();
        int max_index = -1;
        int max_value = Integer.MIN_VALUE;
        for (int i = 0; i < s; i++)
        {
            SiteStats current = sites.peek();
            sites.poll();
            if (current.getNumVisits() >= max_value && i < sort_index)
            {
                max_index = i;
                max_value = current.getNumVisits();
            }
            sites.add(current);
        }
        return max_index;
    }
    public static void insertMaxToRear(Queue<SiteStats> sites,int max_index)
    {
        int s = sites.size();
        SiteStats max_site = null;
        for (int i = 0; i < s; i++)
        {

            SiteStats current = sites.peek();
            sites.remove();
            if (i != max_index)
                sites.add(current);
            else
                max_site = current;
        }
        sites.add(max_site);
    }
    // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static void updateCount(String url) {
        int s = sites.size();
        SiteStats recent = null;
        for (int i = 0; i < s; i++)
        {
            SiteStats current = sites.peek();
            sites.remove();
            if (current.getUrl().equals(url)) {
                current.setNumVisits(current.getNumVisits() + 1);
                recent = current;
            }else {
                sites.add(current);
            }
        }
        if(recent==null)
            recent = new SiteStats(url,1);
        sites.add(recent);
    }

    public static void main(String[] args) {
        String[] visitedSites = { "www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com" };

        for (String url : visitedSites) {
            updateCount(url);
        }
        System.out.println(sites);
        listTopVisitedSites(sites, 5);

    }

}
