package com.example.zaidi_app_project.Models;

import java.util.ArrayList;


public class Model {
    public boolean Success;
    public String Message;
    public ArrayList<UserModel> Data;

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public ArrayList<Model.UserModel> getData() {
        return Data;
    }

    public void setData(ArrayList<Model.UserModel> data) {
        Data = data;
    }

    public ArrayList<UserModel> getData1() {
        return Data1;
    }

    public void setData1(ArrayList<UserModel> data1) {
        Data1 = data1;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getCurrentdate() {
        return Currentdate;
    }

    public void setCurrentdate(String currentdate) {
        Currentdate = currentdate;
    }

    public ArrayList<UserModel> Data1;
    int Status;
    int UserId;
    String Currentdate;


    public static class UserModel {

        int customerid;
        int customercode;

        String customername;
        String gender;

        int agencycode;
        long personalcontact;
        int homecontact;

        String emailid;
        String address;

        int stateid;
        int pincode;

        String birtdate;
        String marriagedate;
        String category;
        String mdrttick;
        String businessprofile;
        String profilepicture;

        int licBranchid;
        int licDivisionEntryid;

        String password;
        String designation;
        String clubnumber;

        boolean lifeinsurance;
        boolean nonlife;
        boolean healthinsurance;
        boolean mutualfunds;
        boolean other;

        String website;
        String eform;
        String edate;
        String gst;
        String fblink;

        long auth_key;
        int instance_id;
        long access_token;

        String cityname;
        String domainname;
        String statename;
        String bimacare_start_date;
        String bimacare_end_date;

        public UserModel(int customerid, int customercode, String customername, String gender, int agencycode, long personalcontact, int homecontact, String emailid, String address, int stateid,
                         int pincode, String birtdate, String marriagedate, String category, String mdrttick, String businessprofile, String profilepicture, int licBranchid, int licDivisionEntryid,
                         String password, String designation, String clubnumber, boolean lifeinsurance, boolean nonlife, boolean healthinsurance, boolean mutualfunds, boolean other, String website,
                         String eform, String edate, String gst, String fblink, long auth_key, int instance_id, long access_token, String cityname, String domainname, String statename,
                         String bimacare_start_date, String bimacare_end_date) {
            this.customerid = customerid;
            this.customercode = customercode;
            this.customername = customername;
            this.gender = gender;
            this.agencycode = agencycode;
            this.personalcontact = personalcontact;
            this.homecontact = homecontact;
            this.emailid = emailid;
            this.address = address;
            this.stateid = stateid;
            this.pincode = pincode;
            this.birtdate = birtdate;
            this.marriagedate = marriagedate;
            this.category = category;
            this.mdrttick = mdrttick;
            this.businessprofile = businessprofile;
            this.profilepicture = profilepicture;
            this.licBranchid = licBranchid;
            this.licDivisionEntryid = licDivisionEntryid;
            this.password = password;
            this.designation = designation;
            this.clubnumber = clubnumber;
            this.lifeinsurance = lifeinsurance;
            this.nonlife = nonlife;
            this.healthinsurance = healthinsurance;
            this.mutualfunds = mutualfunds;
            this.other = other;
            this.website = website;
            this.eform = eform;
            this.edate = edate;
            this.gst = gst;
            this.fblink = fblink;
            this.auth_key = auth_key;
            this.instance_id = instance_id;
            this.access_token = access_token;
            this.cityname = cityname;
            this.domainname = domainname;
            this.statename = statename;
            this.bimacare_start_date = bimacare_start_date;
            this.bimacare_end_date = bimacare_end_date;
        }

        public int getCustomerid() {
            return customerid;
        }

        public void setCustomerid(int customerid) {
            this.customerid = customerid;
        }

        public int getCustomercode() {
            return customercode;
        }

        public void setCustomercode(int customercode) {
            this.customercode = customercode;
        }

        public String getCustomername() {
            return customername;
        }

        public void setCustomername(String customername) {
            this.customername = customername;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAgencycode() {
            return agencycode;
        }

        public void setAgencycode(int agencycode) {
            this.agencycode = agencycode;
        }

        public long getPersonalcontact() {
            return personalcontact;
        }

        public void setPersonalcontact(long personalcontact) {
            this.personalcontact = personalcontact;
        }

        public int getHomecontact() {
            return homecontact;
        }

        public void setHomecontact(int homecontact) {
            this.homecontact = homecontact;
        }

        public String getEmailid() {
            return emailid;
        }

        public void setEmailid(String emailid) {
            this.emailid = emailid;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getStateid() {
            return stateid;
        }

        public void setStateid(int stateid) {
            this.stateid = stateid;
        }

        public int getPincode() {
            return pincode;
        }

        public void setPincode(int pincode) {
            this.pincode = pincode;
        }

        public String getBirtdate() {
            return birtdate;
        }

        public void setBirtdate(String birtdate) {
            this.birtdate = birtdate;
        }

        public String getMarriagedate() {
            return marriagedate;
        }

        public void setMarriagedate(String marriagedate) {
            this.marriagedate = marriagedate;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getMdrttick() {
            return mdrttick;
        }

        public void setMdrttick(String mdrttick) {
            this.mdrttick = mdrttick;
        }

        public String getBusinessprofile() {
            return businessprofile;
        }

        public void setBusinessprofile(String businessprofile) {
            this.businessprofile = businessprofile;
        }

        public String getProfilepicture() {
            return profilepicture;
        }

        public void setProfilepicture(String profilepicture) {
            this.profilepicture = profilepicture;
        }

        public int getLicBranchid() {
            return licBranchid;
        }

        public void setLicBranchid(int licBranchid) {
            this.licBranchid = licBranchid;
        }

        public int getLicDivisionEntryid() {
            return licDivisionEntryid;
        }

        public void setLicDivisionEntryid(int licDivisionEntryid) {
            this.licDivisionEntryid = licDivisionEntryid;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public String getClubnumber() {
            return clubnumber;
        }

        public void setClubnumber(String clubnumber) {
            this.clubnumber = clubnumber;
        }

        public boolean isLifeinsurance() {
            return lifeinsurance;
        }

        public void setLifeinsurance(boolean lifeinsurance) {
            this.lifeinsurance = lifeinsurance;
        }

        public boolean isNonlife() {
            return nonlife;
        }

        public void setNonlife(boolean nonlife) {
            this.nonlife = nonlife;
        }

        public boolean isHealthinsurance() {
            return healthinsurance;
        }

        public void setHealthinsurance(boolean healthinsurance) {
            this.healthinsurance = healthinsurance;
        }

        public boolean isMutualfunds() {
            return mutualfunds;
        }

        public void setMutualfunds(boolean mutualfunds) {
            this.mutualfunds = mutualfunds;
        }

        public boolean isOther() {
            return other;
        }

        public void setOther(boolean other) {
            this.other = other;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getEform() {
            return eform;
        }

        public void setEform(String eform) {
            this.eform = eform;
        }

        public String getEdate() {
            return edate;
        }

        public void setEdate(String edate) {
            this.edate = edate;
        }

        public String getGst() {
            return gst;
        }

        public void setGst(String gst) {
            this.gst = gst;
        }

        public String getFblink() {
            return fblink;
        }

        public void setFblink(String fblink) {
            this.fblink = fblink;
        }

        public long getAuth_key() {
            return auth_key;
        }

        public void setAuth_key(long auth_key) {
            this.auth_key = auth_key;
        }

        public int getInstance_id() {
            return instance_id;
        }

        public void setInstance_id(int instance_id) {
            this.instance_id = instance_id;
        }

        public long getAccess_token() {
            return access_token;
        }

        public void setAccess_token(long access_token) {
            this.access_token = access_token;
        }

        public String getCityname() {
            return cityname;
        }

        public void setCityname(String cityname) {
            this.cityname = cityname;
        }

        public String getDomainname() {
            return domainname;
        }

        public void setDomainname(String domainname) {
            this.domainname = domainname;
        }

        public String getStatename() {
            return statename;
        }

        public void setStatename(String statename) {
            this.statename = statename;
        }

        public String getBimacare_start_date() {
            return bimacare_start_date;
        }

        public void setBimacare_start_date(String bimacare_start_date) {
            this.bimacare_start_date = bimacare_start_date;
        }

        public String getBimacare_end_date() {
            return bimacare_end_date;
        }

        public void setBimacare_end_date(String bimacare_end_date) {
            this.bimacare_end_date = bimacare_end_date;
        }
    }

}

