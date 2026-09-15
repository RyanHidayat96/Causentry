package androidx.work;

import android.app.Notification;

/* JADX INFO: loaded from: classes5.dex */
public final class ForegroundInfo {
    private final int mForegroundServiceType;
    private final Notification mNotification;
    private final int mNotificationId;

    public ForegroundInfo(int i, Notification notification) {
        this(i, notification, 0);
    }

    public ForegroundInfo(int i, Notification notification, int i2) {
        this.mNotificationId = i;
        this.mNotification = notification;
        this.mForegroundServiceType = i2;
    }

    public final int getNotificationId() {
        return this.mNotificationId;
    }

    public final int getForegroundServiceType() {
        return this.mForegroundServiceType;
    }

    public final Notification getNotification() {
        return this.mNotification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.mNotificationId == foregroundInfo.mNotificationId && this.mForegroundServiceType == foregroundInfo.mForegroundServiceType) {
            return this.mNotification.equals(foregroundInfo.mNotification);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.mNotificationId * 31) + this.mForegroundServiceType) * 31) + this.mNotification.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForegroundInfo{mNotificationId=");
        sb.append(this.mNotificationId);
        sb.append(", mForegroundServiceType=");
        sb.append(this.mForegroundServiceType);
        sb.append(", mNotification=");
        sb.append(this.mNotification);
        sb.append('}');
        return sb.toString();
    }
}
