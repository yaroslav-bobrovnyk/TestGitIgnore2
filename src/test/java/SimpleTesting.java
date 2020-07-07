import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class SimpleTesting {
    private Logger logger = LogManager.getLogger(SimpleTesting.class);

    @Test
    public void openPage() {
        logger.info("Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям");
        logger.info("Открыта страница отус");
    }

}
