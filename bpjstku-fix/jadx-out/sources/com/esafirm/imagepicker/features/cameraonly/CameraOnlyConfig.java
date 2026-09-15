package com.esafirm.imagepicker.features.cameraonly;

import android.os.Parcel;
import android.os.Parcelable;
import com.esafirm.imagepicker.features.common.BaseConfig;

/* JADX INFO: loaded from: classes3.dex */
public class CameraOnlyConfig extends BaseConfig {
    public static final Parcelable.Creator<CameraOnlyConfig> CREATOR = new Parcelable.Creator<CameraOnlyConfig>() { // from class: com.esafirm.imagepicker.features.cameraonly.CameraOnlyConfig.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraOnlyConfig createFromParcel(Parcel parcel) {
            return new CameraOnlyConfig(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraOnlyConfig[] newArray(int i) {
            return new CameraOnlyConfig[i];
        }
    };

    @Override // com.esafirm.imagepicker.features.common.BaseConfig, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ CameraOnlyConfig(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // com.esafirm.imagepicker.features.common.BaseConfig, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public CameraOnlyConfig() {
    }

    private CameraOnlyConfig(Parcel parcel) {
        super(parcel);
    }
}
