package my.journaldev.iterator;

public class IteratorPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChannelCollection channels = populateChannels();
		
		ChannelIterator iterator=channels.iterator(ChannelTypeEnum.ORIYA);
		while(iterator.hasNext()) {
			Channel channel=iterator.next();
			System.out.println(channel);
		}
		
		ChannelIterator iterator1=channels.iterator(ChannelTypeEnum.HINDI);
		while(iterator1.hasNext()) {
			Channel channel=iterator1.next();
			System.out.println(channel);
		}
		
	}

	private static ChannelCollection populateChannels() {
		// TODO Auto-generated method stub
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.BENGOLI));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.TELUGU));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.ORIYA));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.ORIYA));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.ORIYA));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.TAMIL));
		return channels;
	}

}
