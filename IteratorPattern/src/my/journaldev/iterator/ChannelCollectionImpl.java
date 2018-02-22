package my.journaldev.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
	private List<Channel> channel;
	
	public ChannelCollectionImpl() {
		this.channel = new ArrayList<Channel>();
	}

	@Override
	public void addChannel(Channel c) {
		// TODO Auto-generated method stub
		channel.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		// TODO Auto-generated method stub
		channel.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		// TODO Auto-generated method stub
		return new ChannelIteratorImpl(type,this.channel);
	}

}
