    package br.com.analytics.customermetrics.repository;

    import br.com.analytics.customermetrics.model.User;
    import org.springframework.cloud.openfeign.FeignClient;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestMethod;

    @FeignClient(name = "USER-SERVICE")
    public interface CustomerApiService {

        @RequestMapping(method = RequestMethod.GET, value ="/{id}")
        User getById(@PathVariable Long id);
    }
