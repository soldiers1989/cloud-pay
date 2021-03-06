package com.cloud.pay.trade.constant;

/**
 * 交易常量
 * @author kftpay-core
 *
 */
public class TradeConstant {

	/**处理中 */
	public final static int STATUS_PROCESSING = 1;
	/**成功 */
	public final static int STATUS_SUCCESS = 2;
	/**失败 */
	public final static int STATUS_FAIL = 3;
	
	/**系统内部异常响应码*/
	public final static String SYS_EXCEPTION = "PAY_000000";
	/**订单号重复*/
	public final static String ORDER_NO_EXIST = "PAY_000001";
}
