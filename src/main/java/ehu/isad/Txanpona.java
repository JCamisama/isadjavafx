package ehu.isad;

public class Txanpona {

    int trade_id;
    public float price;
    float size;
    String time;
    float bid;
    float ask;
    float volume;

    @Override
    public String toString() {
        return "KriptoMonetenApp{" +
                "trade_id=" + trade_id +
                ", price=" + price +
                ", size=" + size +
                ", time='" + time + '\'' +
                ", bid=" + bid +
                ", ask=" + ask +
                ", volume=" + volume +
                '}';
    }
}
