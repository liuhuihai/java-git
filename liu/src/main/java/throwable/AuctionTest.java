package throwable;

/**
 * @author liuhuihai
 * @date 2019-04-29 23:37
 * @description 协作处理异常
 */
public class AuctionTest {

    private double initPrice = 3.3;
    private void bid(String bidPrice){
        double price = 0.0;
        try {
            price = Double.parseDouble(bidPrice);
        }catch (Exception e){
            e.printStackTrace();
            throw new NullPointerException("价值不能为 null！");
        }
    }

    public static void main(String[] args) {
        AuctionTest test = new AuctionTest();
        test.bid("");
    }
}
