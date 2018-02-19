package com.example.frankxu.education;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by frankxu on 2018-02-19.
 */

public class MajorLab {
    private static MajorLab sMajorLab;
    private List<Major> mMajors;

    public static MajorLab get(Context context){
        if (sMajorLab == null){
            sMajorLab = new MajorLab(context);
        }
        return sMajorLab;
    }

    private MajorLab(Context context){
        mMajors = new ArrayList<>();
    }

    public List<Major> getMajors(){
        return mMajors;
    }

    public Major getMajor(UUID id){
        for(Major major: mMajors){
            if(major.getId().equals(id)){
                return major;
            }
        }
        return null;
    }
}
