package com.example.zaidi_app_project.Handler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.zaidi_app_project.Models.Model;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "zaidi_app";

    private static final int DB_VERSION = 1;

    private static final String TABLE_NAME = "user_data";

    private static final String col_customerid = "CUSTOMER_ID";
    private static final String col_customercode = "CUSTOMER_CODE";
    private static final String col_customername = "CUSTOMER_NAME";
    private static final String col_gender = "GENDER";
    private static final String col_agencycode = "AGENCY_CODE";
    private static final String col_personalcontact = "PERSONAL_CONTACT";
    private static final String col_homecontact = "HOME_CONTACT";

    private static final String col_emailid = "EMAIL_ID";
    private static final String col_address = "ADDRESS";

    private static final String col_stateid = "STATE_ID";
    private static final String col_pincode = "PINCODE";
    private static final String col_birtdate = "BIRT_DATE";
    private static final String col_marriagedate = "MARRIAGE_DATE";
    private static final String col_category = "CATEGORY";
    private static final String col_mdrttick = "MDRTTICK";
    private static final String col_businessprofile = "BUSINESS_PROFILE";
    private static final String col_profilepicture = "PROFILE_PICTURE";
    private static final String col_licBranchid = "LIC_BRANCH_ID";
    private static final String col_licDivisionEntryid = "LIC_DIVISION_ENTRY_ID";
    private static final String col_password = "PASSWORD";
    private static final String col_designation = "DESIGNATION";
    private static final String col_clubnumber = "CLUB_MEMBER";

    private static final String col_lifeinsurance = "LIFE_INSURANCE";
    private static final String col_nonlife = "NON_LIFE";
    private static final String col_healthinsurance = "HEALTH_INSURANCE";
    private static final String col_mutualfunds = "MUTUAL_FUNDS";
    private static final String col_other = "OTHER";

    private static final String col_website = "WEBSITE";
    private static final String col_eform = "EFORM";
    private static final String col_edate = "EDATE";
    private static final String col_gst = "GST";
    private static final String col_fblink = "FB_LINK";
    private static final String col_auth_key = "AUTH_KEY";
    private static final String col_instance_id = "INSTANCE_ID";
    private static final String col_access_token = "ACCESS_TOKEN";
    private static final String col_cityname = "CITY_NAME";
    private static final String col_domainname = "DOMAIN_NAME";
    private static final String col_statename = "STATE_NAME";
    private static final String col_bimacare_start_date = "BIMACARE_START_DATE";
    private static final String col_bimacare_end_date = "BIMACARE_END_DATE";

    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + col_customerid + " INTEGER NOT NULL, "
                + col_customercode + " INTEGER, "
                + col_customername + " TEXT NOT NULL, "
                + col_gender + " TEXT, "
                + col_agencycode + " INTEGER , "
                + col_personalcontact + " INTEGER, "
                + col_homecontact + " INTEGER, "
                + col_emailid + " TEXT, "
                + col_address + " TEXT, "
                + col_stateid + " INTEGER, "
                + col_pincode + " INTEGER, "
                + col_birtdate + " TEXT, "
                + col_marriagedate + " TEXT, "
                + col_category + " TEXT, "
                + col_mdrttick + " BOOLEAN, "
                + col_businessprofile + " INTEGER , "
                + col_profilepicture + " TEXT, "
                + col_licBranchid + " INTEGER, "
                + col_licDivisionEntryid + " INTEGER, "
                + col_password + " TEXT, "
                + col_designation + " TEXT, "
                + col_clubnumber + " TEXT, "
                + col_lifeinsurance + " BOOLEAN, "
                + col_nonlife + " BOOLEAN, "
                + col_healthinsurance + " BOOLEAN, "
                + col_mutualfunds + " BOOLEAN, "
                + col_other + " BOOLEAN, "
                + col_website + " TEXT, "
                + col_eform + " TEXT, "
                + col_edate + " TEXT, "
                + col_gst + " TEXT , "
                + col_fblink + " TEXT, "
                + col_auth_key + " INTEGER NOT NULL, "
                + col_instance_id + " INTEGER NOT NULL, "
                + col_access_token + " INTEGER NOT NULL , "
                + col_cityname + " TEXT, "
                + col_domainname + " TEXT, "
                + col_statename + " TEXT, "
                + col_bimacare_start_date + " TEXT, "
                + col_bimacare_end_date + " TEXT)";


        sqLiteDatabase.execSQL(query);

    }

    public ArrayList<Model.UserModel> readUser() {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        ArrayList<Model.UserModel> userModelArrayList = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                userModelArrayList.add(new Model.UserModel(
                        cursor.getInt(0),
                        cursor.getInt(1),

                        cursor.getString(2),
                        cursor.getString(3),

                        cursor.getInt(4),
                        cursor.getLong(5),
                        cursor.getInt(6),

                        cursor.getString(7),
                        cursor.getString(8),

                        cursor.getInt(9),
                        cursor.getInt(10),

                        cursor.getString(11),
                        cursor.getString(12),
                        cursor.getString(13),
                        cursor.getString(14),
                        cursor.getString(15),
                        cursor.getString(16),

                        cursor.getInt(17),
                        cursor.getInt(18),

                        cursor.getString(19),
                        cursor.getString(20),
                        cursor.getString(21),

                        cursor.getInt(22) == 1,
                        cursor.getInt(23) == 1,
                        cursor.getInt(24) == 1,
                        cursor.getInt(25) == 1,
                        cursor.getInt(26) == 1,

                        cursor.getString(27),
                        cursor.getString(28),
                        cursor.getString(29),
                        cursor.getString(30),
                        cursor.getString(31),

                        cursor.getLong(32),
                        cursor.getInt(33),
                        cursor.getLong(34),

                        cursor.getString(35),
                        cursor.getString(36),
                        cursor.getString(37),
                        cursor.getString(38),
                        cursor.getString(39)));
            } while (cursor.moveToNext());
        }

        db.close();

        return userModelArrayList;
    }

    public boolean checkUser(int id) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        String query = "SELECT * FROM " + TABLE_NAME + " WHERE " + col_customerid + " = " + id;
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);

        int count = cursor.getCount();
        return count > 0;
    }

    public void addUser(
            int customerid,
            int customercode,
            String customername,
            String gender,
            int agencycode,
            long personalcontact,
            int homecontact,
            String emailid,
            String address,
            int stateid,
            int pincode,
            String birtdate,
            String marriagedate,
            String category,
            String mdrttick,
            String businessprofile,
            String profilepicture,
            int licBranchid,
            int licDivisionEntryid,
            String password,
            String designation,
            String clubnumber,
            boolean lifeinsurance,
            boolean nonlife,
            boolean healthinsurance,
            boolean mutualfunds,
            boolean other,
            String website,
            String eform,
            String edate,
            String gst,
            String fblink,
            long auth_key,
            int instance_id,
            long access_token,
            String cityname,
            String domainname,
            String statename,
            String bimacare_start_date,
            String bimacare_end_date
    ) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(col_customerid, customerid);
        values.put(col_customercode, customercode);
        values.put(col_customername, customername);
        values.put(col_gender, gender);
        values.put(col_agencycode, agencycode);
        values.put(col_personalcontact, personalcontact);
        values.put(col_homecontact, homecontact);
        values.put(col_emailid, emailid);
        values.put(col_address, address);
        values.put(col_stateid, stateid);
        values.put(col_pincode, pincode);
        values.put(col_birtdate, birtdate);
        values.put(col_marriagedate, marriagedate);
        values.put(col_category, category);
        values.put(col_mdrttick, mdrttick);
        values.put(col_businessprofile, businessprofile);
        values.put(col_profilepicture, profilepicture);
        values.put(col_licBranchid, licBranchid);
        values.put(col_licDivisionEntryid, licDivisionEntryid);
        values.put(col_password, password);
        values.put(col_designation, designation);
        values.put(col_clubnumber, clubnumber);
        values.put(col_lifeinsurance, lifeinsurance);
        values.put(col_nonlife, nonlife);
        values.put(col_healthinsurance, healthinsurance);
        values.put(col_mutualfunds, mutualfunds);
        values.put(col_other, other);
        values.put(col_website, website);
        values.put(col_eform, eform);
        values.put(col_edate, edate);
        values.put(col_gst, gst);
        values.put(col_fblink, fblink);
        values.put(col_auth_key, auth_key);
        values.put(col_instance_id, instance_id);
        values.put(col_access_token, access_token);
        values.put(col_cityname, cityname);
        values.put(col_domainname, domainname);
        values.put(col_statename, statename);
        values.put(col_bimacare_start_date, bimacare_start_date);
        values.put(col_bimacare_end_date, bimacare_end_date);

        if (checkUser(customerid)) {
            db.update(TABLE_NAME, values, col_customerid + " = ?", new String[]{String.valueOf(customerid)});
        } else {
            db.insert(TABLE_NAME, null, values);
        }
        db.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
