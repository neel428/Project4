package edu.uga.cs.project4;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sql /*extends SQLiteOpenHelper*/ {
   // @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //sqLiteDatabase.execSQL();
    }

  //  @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //sqLiteDatabase.execSQL("drop table if exists" + );
        onCreate(sqLiteDatabase);
    }


}
