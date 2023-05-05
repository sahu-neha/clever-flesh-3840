package com.masai.service;

import java.util.List;

import com.masai.exception.NotFoundException;
import com.masai.model.Bid;

public interface BidService {
	public Bid submitBid(Bid bid)throws Exception;
	
	public List<Bid> getBidHistoryByVendorId(Integer vendorId) throws NotFoundException;
	
	public Bid getBidByBidId(Integer bidId) throws Exception;
	
	public List<Bid> getBidsByTenderId(Integer tenderId);
	
	public Bid updateBidStatus(Integer bidId, String bidStatus) throws Exception;
}
