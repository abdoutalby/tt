package com.example.tt.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {



    public DBHelper(@Nullable Context context) {
        super(context, "tt.db",null ,1);

    }

    @Override
    public void onCreate(SQLiteDatabase DB) {

        DB.execSQL("Create Table abonement (id INTEGER primary key AUTOINCREMENT , " +
                        "sexe TEXT ," +
                        "nom TEXT," +
                        "prenom TEXT," +
                        "dn TEXT," +
                        "adr TEXT ," +
                        "emp TEXT," +
                        "vorigin TEXT," +
                        "vact TEXT," +
                        "codepostal TEXT," +
                        "tel TEXT," +
                        "email TEXT," +
                        "numtt TEXT )");



        DB.execSQL("Create Table portabilite (id INTEGER primary key AUTOINCREMENT , " +
                 "nom TEXT," +
                "prenom TEXT," +
                 "adr TEXT ," +
                 "email TEXT," +
                "operateur TEXT ," +
                "numtt TEXT)");


        DB.execSQL("Create Table reclamation (id INTEGER primary key AUTOINCREMENT , " +
                        "nom TEXT ," +
                        "prenom TEXT," +
                        "adr TEXT, " +
                        "cp TEXT," +
                        "email TEXT ," +
                        "tel TEXT," +
                        "type TEXT," +
                        "description TEXT)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists abonement");
    }

    public boolean reclamer(Reclamation dto){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("id",  (Byte) null);
        contentValues.put("nom", dto.getNom());
        contentValues.put("prenom", dto.getPrenom());
        contentValues.put("adr", dto.getAdr());
        contentValues.put("cp", dto.getCp());
        contentValues.put("tel", dto.getTel());
        contentValues.put("email", dto.getEmail());
        contentValues.put("description", dto.getDescription());
        contentValues.put("type", dto.getType());
        long res = DB.insert("reclamation", null, contentValues);

        if (res == -1) {
            return false;
        } else {
            return true;
        }

    }

    public boolean addAbonnement(Abonnement abonnement){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("id",  (Byte) null);
        contentValues.put("sexe", abonnement.getSexe());
        contentValues.put("nom", abonnement.getNom());
        contentValues.put("prenom", abonnement.getPrenom());
        contentValues.put("dn", abonnement.getDn());
        contentValues.put("adr", abonnement.getAdr());
        contentValues.put("emp", abonnement.getEmp());
        contentValues.put("vorigin", abonnement.getVorigin());
        contentValues.put("vact", abonnement.getVact());
        contentValues.put("codepostal", abonnement.getCodepostal());
        contentValues.put("tel", abonnement.getTel());
        contentValues.put("email", abonnement.getEmail());
        contentValues.put("numtt", abonnement.getNumtt());


        long res = DB.insert("abonement", null, contentValues);

        if (res == -1) {
            return false;
        } else {
            return true;
        }

    }


    public boolean portabilite(Portabilite portabilite){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("id",  (Byte) null);
        contentValues.put("nom", portabilite.getNom());
        contentValues.put("prenom", portabilite.getPrenom());
        contentValues.put("adr", portabilite.getAdr());
        contentValues.put("email", portabilite.getEmail());
        contentValues.put("operateur", portabilite.getOperateur());
        contentValues.put("numtt", portabilite.getTel());

        long res = DB.insert("portabilite", null, contentValues);

        if (res == -1) {
            return false;
        } else {
            return true;
        }

    }
}
