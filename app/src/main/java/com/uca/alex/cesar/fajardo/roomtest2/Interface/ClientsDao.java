package com.uca.alex.cesar.fajardo.roomtest2.Interface;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.uca.alex.cesar.fajardo.roomtest2.clients.Clients;

import java.util.List;

public interface ClientsDao {

    @Query("SELECT * FROM clients")
    List<Clients> getAll();

    @Insert
    void insertAll(Clients... clients);
}
