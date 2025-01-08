package com.example.network;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface TermekApi {
    @GET("termekek")
    Call<List<Termekek>> getTermekek();

    @PUT("termekek/{id}")
    Call<Void> updateTermek(@Path("id") int id, @Body Termekek termek);

    @DELETE("termekek/{id}")
    Call<Void> deleteTermek(@Path("id") int id);
}
