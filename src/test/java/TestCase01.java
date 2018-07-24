import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestCase01 {

  private Logger logger=LoggerFactory.getLogger(TestCase01.class);

  @Test(groups = {"regression"})
  public void method01(ITestContext ctx){
    logger.info("Suite name {}",ctx.getCurrentXmlTest().getName());
    logger.info("This is the thread ID {} of the class {}",Thread.currentThread().getId(),getClass().getName());
  }

  @Test(groups = {"sanity"})
  public void method02(ITestContext ctx){
    logger.info("Suite name {}",ctx.getCurrentXmlTest().getName());
    logger.info("This is the thread ID {} of the class {}",Thread.currentThread().getId(),getClass().getName());
  }
}
