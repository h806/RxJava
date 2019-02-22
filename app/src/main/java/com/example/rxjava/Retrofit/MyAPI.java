package com.example.rxjava.Retrofit;

import com.example.rxjava.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyAPI {
    @GET("posts")
    Observable<List<Post>> getPost();
}
