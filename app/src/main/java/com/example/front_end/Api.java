package com.example.front_end;
import org.jetbrains.annotations.NotNull;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api {


//    @NotNull
//    Call<ResponseBody> createUser(@NotNull User user);



        // the interface file holds the api requests
//users/api/register/
        @POST("register")
        Call<ResponseBody> createUser (
                @Body User user
        );

        @POST("login")
        Call<ResponseBody> checkUser (
                @Body User user
        );

    }

