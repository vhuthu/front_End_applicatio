package com.example.front_end;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetroFitClient {

        private static  final String BASE_URL = "http://10.0.2.2:8080/api/";
        //10.0.2.2 dynamic address
    //10.100.2.38 personal ip
        private static RetroFitClient mInstance;
        private Retrofit retrofit;

        private RetroFitClient () {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        public static synchronized RetroFitClient getInstance() {
            if (mInstance == null) {
                mInstance = new RetroFitClient();
            }
            return mInstance;
        }

        public Api getAPI () {
            return retrofit.create(Api.class);
        }

    }


