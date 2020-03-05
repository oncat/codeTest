package wechat.server.handler;

public class FindMeetTime {
    //对T用A行走两百米所耗费的时间+120秒取余，如果时间大于A走两百米耗时则暂停，下面的b也一样，直到下一个120秒后再继续移动
    //如果a+800=b行走大于b移动距离那一刻，则两个人相遇
    public static void main(String[] args) {
        double a = 0, b = 0, t = 0;
        for (t = 0; b <= a + 800; t++) {

            if (t % (200.0 / (40.0 / 60) + 120) <= (200.0 / (40.0 / 60))) {
                a += (40 / 60.0);
            }
            if (t % (200.0 / (60.0 / 60) + 120) <= (200.0 / (60.0 / 60))) {
                b += (60 / 60.0);
            }
        }
        System.out.println(t / 60.0);
    }
}
