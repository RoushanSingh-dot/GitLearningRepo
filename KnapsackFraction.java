import java.util.*;


public class KnapsackFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter no. of items");
		int n=5,q=0,cap=60;
		int val[]= {30,40,45,77,90};
		int w[]= {5,10,15,22,25};
		TreeMap<Double,Integer> tMap=new TreeMap<>();
		for(int i=0;i<n;i++)
		tMap.put((val[i]*1.0/w[i]), i);
        NavigableSet<Double> set1 = tMap.descendingKeySet(); 
        double p=0;
        Iterator<Double> iterator =set1.iterator();
        while(iterator.hasNext())
        {
        	p=iterator.next();
        	if(w[tMap.get(p)]<cap)
        	{
        		q=q+val[tMap.get(p)];
        		cap-=w[tMap.get(p)];
        	}
        	else {
        		q+=(cap*1.0/w[tMap.get(p)]*val[tMap.get(p)]);
        		break;
			}
        }
        System.out.println(q);
		}
	}


