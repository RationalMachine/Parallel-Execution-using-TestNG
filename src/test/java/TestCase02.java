import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestCase02 {

  private Logger logger=LoggerFactory.getLogger(TestCase02.class);

  @Test(groups = {"regression"})
  public void method03(ITestContext ctx){
    logger.info("Suite name {}",ctx.getCurrentXmlTest().getName());
    logger.info("This is the thread ID {} of the class {}",Thread.currentThread().getId(),getClass().getName());
  }

  @Test(groups = {"sanity"})
  public void method04(ITestContext ctx){
    logger.info("Suite name {}",ctx.getCurrentXmlTest().getName());
    logger.info("This is the thread ID {} of the class {}",Thread.currentThread().getId(),getClass().getName());
  }

}
