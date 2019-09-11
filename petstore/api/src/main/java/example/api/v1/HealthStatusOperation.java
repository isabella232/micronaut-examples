package example.api.v1;

import io.reactivex.Single;
import io.micronaut.http.annotation.Get;

public interface HealthStatusOperation {
    @Get("/actuator/health")
    Single<HealthStatus> health();
}
