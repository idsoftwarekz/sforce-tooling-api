package kz.idsoftware.sforce.api.tooling;

import com.sforce.soap.tooling.ToolingConnection;
import com.sforce.soap.tooling.ToolingService;
import org.junit.Assert;
import org.junit.Test;

public class ConnectionTest {

  @Test
  public void testCreateConnection() {
    ToolingService service = new ToolingService();

    ToolingConnection connection = service.getToolingConnection();

    Assert.assertNotNull(connection);
  }

}
