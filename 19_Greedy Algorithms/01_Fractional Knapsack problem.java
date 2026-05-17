import java.util.*;
class Result
{
    static class Item
    {
        int value, weight;
        double ratio;
        Item(int value, int weight)
        {
            this.value = value;
            this.weight = weight;
            this.ratio = (double)value / weight;
        }
    }
    static double fractionalKnapsack(int val[],
                                     int weight[],
                                     int n,
                                     int capacity)
    {
        Item items[] = new Item[n];
        for(int i = 0; i < n; i++)
        {
            items[i] = new Item(val[i], weight[i]);
        }
        // Sort by ratio descending
        Arrays.sort(items, (a, b) ->
            Double.compare(b.ratio, a.ratio));
        double totalValue = 0.0;
        for(int i = 0; i < n; i++)
        {
            // Take full item
            if(capacity >= items[i].weight)
            {
                totalValue += items[i].value;
                capacity -= items[i].weight;
            }
            else
            {
                // Take fractional part
                totalValue += items[i].ratio * capacity;
                break;
            }
        }
        return Math.round(totalValue * 100.0) / 100.0;
    }
}