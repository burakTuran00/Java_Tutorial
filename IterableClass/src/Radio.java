import java.util.ArrayList;
import java.util.Iterator;

public class Radio implements Iterable<String>
{
    private ArrayList<String> channelsList = new ArrayList<String>();

    public Radio(String[] channels)
    {
        for(String channel : channels)
        {
            channelsList.add(channel);
        }
    }

    @Override
    public Iterator<String> iterator()
    {
       // return channelsList.iterator();
        return new RadioIterator();
    }

    public class RadioIterator implements Iterator<String>
    {
        private int index = 0;
        @Override
        public boolean hasNext()
        {
            if(index < channelsList.size())
            {
                return true;
            }

            else {
                return false;
            }
        }

        @Override
        public String next()
        {
            String value = channelsList.get(index);
            index++;

            return value;
        }
    }
}
