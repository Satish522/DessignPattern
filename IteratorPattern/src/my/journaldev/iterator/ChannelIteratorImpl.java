package my.journaldev.iterator;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

	private ChannelTypeEnum type;
	private List<Channel> channel;
	private int position;
	
	
	
	
	public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channel) {
		this.type = type;
		this.channel = channel;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		while(position < channel.size()) {
			Channel c = channel.get(position);
			if(c.getTYPE().equals(type)) {
				return true;
			}else 
				position++;
		}
		return false;
	}

	@Override
	public Channel next() {
		// TODO Auto-generated method stub
		Channel c = channel.get(position);
		position++;
		return c;
		 
	}

}
