
package baedalteamfive.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="inventory", url="http://inventory:8080")
public interface CancellationService {

    @RequestMapping(method= RequestMethod.GET, path="/cancellations")
    public void menuDelete(@RequestBody Cancellation cancellation);

}