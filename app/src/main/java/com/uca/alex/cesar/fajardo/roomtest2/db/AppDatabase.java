package com.uca.alex.cesar.fajardo.roomtest2.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.uca.alex.cesar.fajardo.roomtest2.Interface.ClientsDao;
import com.uca.alex.cesar.fajardo.roomtest2.clients.Clients;

@Database(entities = Clients.class, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ClientsDao clientsDao();
}
