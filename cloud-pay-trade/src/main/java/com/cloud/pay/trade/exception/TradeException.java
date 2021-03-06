package com.cloud.pay.trade.exception;

/**
 * 交易异常
 * @author kftpay-core
 *
 */
public class TradeException extends Exception {

	private static final long serialVersionUID = -2538437452138756315L;
	
	private String exCode;
	
	public TradeException(String message, String exCode) {
		super(message);
		this.exCode = exCode;
	}

	public String getExCode() {
		return exCode;
	}
	
}
