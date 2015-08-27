package me.patrix.pubsub;

import retrofit.http.GET;
import rx.Observable;

/**
 * Created by patrix on 19/08/15.
 */
public interface Server {
    @GET("/")
    Observable<String> result();
}
