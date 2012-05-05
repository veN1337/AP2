package objects;

public abstract class AbstractTestToken {
	protected AbstractToken object;
	private static final Token w = WhiteToken.instance();
	private static final Token b = BlackToken.instance();

	protected static final Token[] ts2 = {w,w,w,b,w,w,b,w};
	protected static final Token[] ts3 = {w,b,b,w,w,w,b,w};
	protected static final Token[] ts4 = {w,b,b,w,w,w,b,b};
}
