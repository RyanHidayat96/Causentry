package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes5.dex */
public class Transition {
    private String mConstraintSetEnd;
    private String mConstraintSetStart;
    private String mId;
    private OnSwipe mOnSwipe = null;
    final int UNSET = -1;
    private final int DEFAULT_DURATION = 400;
    private final float DEFAULT_STAGGER = 0.0f;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mDuration = 400;
    private float mStagger = 0.0f;
    private KeyFrames mKeyFrames = new KeyFrames();

    public void setOnSwipe(OnSwipe onSwipe) {
        this.mOnSwipe = onSwipe;
    }

    public void setKeyFrames(Keys keys) {
        this.mKeyFrames.add(keys);
    }

    public Transition(String str, String str2) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = "default";
        this.mConstraintSetStart = str;
        this.mConstraintSetEnd = str2;
    }

    public Transition(String str, String str2, String str3) {
        this.mId = null;
        this.mConstraintSetEnd = null;
        this.mConstraintSetStart = null;
        this.mId = str;
        this.mConstraintSetStart = str2;
        this.mConstraintSetEnd = str3;
    }

    String toJson() {
        return toString();
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setTo(String str) {
        this.mConstraintSetEnd = str;
    }

    public void setFrom(String str) {
        this.mConstraintSetStart = str;
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public void setStagger(float f) {
        this.mStagger = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mId);
        sb.append(":{\nfrom:'");
        sb.append(this.mConstraintSetStart);
        sb.append("',\nto:'");
        sb.append(this.mConstraintSetEnd);
        sb.append("',\n");
        String string = sb.toString();
        if (this.mDuration != 400) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("duration:");
            sb2.append(this.mDuration);
            sb2.append(",\n");
            string = sb2.toString();
        }
        if (this.mStagger != 0.0f) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append("stagger:");
            sb3.append(this.mStagger);
            sb3.append(",\n");
            string = sb3.toString();
        }
        if (this.mOnSwipe != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string);
            sb4.append(this.mOnSwipe.toString());
            string = sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(string);
        sb5.append(this.mKeyFrames.toString());
        String string2 = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(string2);
        sb6.append("},\n");
        return sb6.toString();
    }

    public String getId() {
        return this.mId;
    }
}
