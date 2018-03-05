package com.example.ramliy.catatanapps.db;

import android.provider.BaseColumns;

/**
 * Created by Ramliy on 3/5/18.
 */

public class DatabaseContract {

    static String TABLE_NOTE = "note";

    static final class NoteColumns implements BaseColumns {

        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String DATE = "date";

    }
}
