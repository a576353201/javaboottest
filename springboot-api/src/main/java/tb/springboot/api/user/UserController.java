package tb.springboot.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tb.springboot.common.annotation.AutoModel;
import tb.springboot.common.util.R;
import tb.springboot.data.entity.test.GuserEntity3;
import tb.springboot.service.IGuserService;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IGuserService guserService;
    @RequestMapping(value = "/list1", method = RequestMethod.GET, consumes = "text/html;charset=UTF-8")
    public R list1() {
        return R.error();
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST, consumes = "application/json")
    public R list(@RequestBody Map<String, Object> params) {
        return R.ok(guserService.queryPage(params));
    }

    @AutoModel
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
    public R save(@RequestBody GuserEntity3 guserEntity3) {
        return guserService.saveOrUpdate(guserEntity3) ? R.ok() : R.error();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST, consumes = "application/json")
    public R delete(@PathVariable Long id) {
        return guserService.removeById(id) ? R.ok() : R.error();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.POST, consumes = "application/json")
    public R load(@PathVariable Long id) {
        return R.ok(guserService.getById(id));
    }
}
