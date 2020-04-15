package com.users.ribbon.feignclient;
​
import java.util.List;​
​
import org.springframework.cloud.netflix.ribbon.RibbonClient;​
import org.springframework.cloud.openfeign.FeignClient;​
import org.springframework.web.bind.annotation.GetMapping;​
​
import com.users.ribbon.models.Order;​
​
​
//@FeignClient(name="orders-service")​
@FeignClient(name="api-gateway-service")​
@RibbonClient(name="orders-service")​
public interface OrderClient {​
​
//@GetMapping("/demo/orders")​
@GetMapping("/orders-service/demo/orders")​
public List<Order> getAll();​
​
/*@GetMapping("/{userId}")​
public List<Order> getAllById(@PathVariable("userId") String userId);​
​
@GetMapping("/byparam")​
public List<Order> getAllByReqParam(@RequestParam("userId") String userId);​
​
@PostMapping("/byparam")​
public List<Order> getAllByPostReqParam(@RequestParam("userId") String userId);​
​
@PostMapping("/bybody")​
public Order getAllByPostReqBody(@RequestBody Order order);​
*/​
​
}​