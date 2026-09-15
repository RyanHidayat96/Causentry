package androidx.constraintlayout.core.dsl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class Constraint {
    public static final Constraint PARENT = new Constraint("parent");
    static int UNSET = Integer.MIN_VALUE;
    static Map<ChainMode, String> chainModeMap;
    private float mCircleAngle;
    private String mCircleConstraint;
    private int mCircleRadius;
    private boolean mConstrainedHeight;
    private boolean mConstrainedWidth;
    private String mDimensionRatio;
    private int mEditorAbsoluteX;
    private int mEditorAbsoluteY;
    private int mHeight;
    private Behaviour mHeightDefault;
    private int mHeightMax;
    private int mHeightMin;
    private float mHeightPercent;
    private float mHorizontalBias;
    private ChainMode mHorizontalChainStyle;
    private float mHorizontalWeight;
    private final String mId;
    private String[] mReferenceIds;
    private float mVerticalBias;
    private ChainMode mVerticalChainStyle;
    private float mVerticalWeight;
    private int mWidth;
    private Behaviour mWidthDefault;
    private int mWidthMax;
    private int mWidthMin;
    private float mWidthPercent;
    String helperType = null;
    String helperJason = null;
    private HAnchor mLeft = new HAnchor(HSide.LEFT);
    private HAnchor mRight = new HAnchor(HSide.RIGHT);
    private VAnchor mTop = new VAnchor(VSide.TOP);
    private VAnchor mBottom = new VAnchor(VSide.BOTTOM);
    private HAnchor mStart = new HAnchor(HSide.START);
    private HAnchor mEnd = new HAnchor(HSide.END);
    private VAnchor mBaseline = new VAnchor(VSide.BASELINE);

    public enum Behaviour {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    public enum ChainMode {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum HSide {
        LEFT,
        RIGHT,
        START,
        END
    }

    public enum Side {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    public enum VSide {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        HashMap map = new HashMap();
        chainModeMap = map;
        map.put(ChainMode.SPREAD, "spread");
        chainModeMap.put(ChainMode.SPREAD_INSIDE, "spread_inside");
        chainModeMap.put(ChainMode.PACKED, "packed");
    }

    public Constraint(String str) {
        int i = UNSET;
        this.mWidth = i;
        this.mHeight = i;
        this.mHorizontalBias = Float.NaN;
        this.mVerticalBias = Float.NaN;
        this.mDimensionRatio = null;
        this.mCircleConstraint = null;
        this.mCircleRadius = Integer.MIN_VALUE;
        this.mCircleAngle = Float.NaN;
        this.mEditorAbsoluteX = Integer.MIN_VALUE;
        this.mEditorAbsoluteY = Integer.MIN_VALUE;
        this.mVerticalWeight = Float.NaN;
        this.mHorizontalWeight = Float.NaN;
        this.mHorizontalChainStyle = null;
        this.mVerticalChainStyle = null;
        this.mWidthDefault = null;
        this.mHeightDefault = null;
        this.mWidthMax = i;
        this.mHeightMax = i;
        this.mWidthMin = i;
        this.mHeightMin = i;
        this.mWidthPercent = Float.NaN;
        this.mHeightPercent = Float.NaN;
        this.mReferenceIds = null;
        this.mConstrainedWidth = false;
        this.mConstrainedHeight = false;
        this.mId = str;
    }

    public class VAnchor extends Anchor {
        VAnchor(VSide vSide) {
            super(Side.valueOf(vSide.name()));
        }
    }

    public class HAnchor extends Anchor {
        HAnchor(HSide hSide) {
            super(Side.valueOf(hSide.name()));
        }
    }

    public class Anchor {
        Anchor mConnection = null;
        int mGoneMargin = Integer.MIN_VALUE;
        int mMargin;
        final Side mSide;

        Anchor(Side side) {
            this.mSide = side;
        }

        public String getId() {
            return Constraint.this.mId;
        }

        Constraint getParent() {
            return Constraint.this;
        }

        public void build(StringBuilder sb) {
            if (this.mConnection != null) {
                sb.append(this.mSide.toString().toLowerCase());
                sb.append(":");
                sb.append(this);
                sb.append(",\n");
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            if (this.mConnection != null) {
                sb.append("'");
                sb.append(this.mConnection.getId());
                sb.append("','");
                sb.append(this.mConnection.mSide.toString().toLowerCase());
                sb.append("'");
            }
            if (this.mMargin != 0) {
                sb.append(",");
                sb.append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    sb.append(",0,");
                    sb.append(this.mGoneMargin);
                } else {
                    sb.append(",");
                    sb.append(this.mGoneMargin);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public HAnchor getLeft() {
        return this.mLeft;
    }

    public HAnchor getRight() {
        return this.mRight;
    }

    public VAnchor getTop() {
        return this.mTop;
    }

    public VAnchor getBottom() {
        return this.mBottom;
    }

    public HAnchor getStart() {
        return this.mStart;
    }

    public HAnchor getEnd() {
        return this.mEnd;
    }

    public VAnchor getBaseline() {
        return this.mBaseline;
    }

    public float getHorizontalBias() {
        return this.mHorizontalBias;
    }

    public void setHorizontalBias(float f) {
        this.mHorizontalBias = f;
    }

    public float getVerticalBias() {
        return this.mVerticalBias;
    }

    public void setVerticalBias(float f) {
        this.mVerticalBias = f;
    }

    public String getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public void setDimensionRatio(String str) {
        this.mDimensionRatio = str;
    }

    public String getCircleConstraint() {
        return this.mCircleConstraint;
    }

    public void setCircleConstraint(String str) {
        this.mCircleConstraint = str;
    }

    public int getCircleRadius() {
        return this.mCircleRadius;
    }

    public void setCircleRadius(int i) {
        this.mCircleRadius = i;
    }

    public float getCircleAngle() {
        return this.mCircleAngle;
    }

    public void setCircleAngle(float f) {
        this.mCircleAngle = f;
    }

    public int getEditorAbsoluteX() {
        return this.mEditorAbsoluteX;
    }

    public void setEditorAbsoluteX(int i) {
        this.mEditorAbsoluteX = i;
    }

    public int getEditorAbsoluteY() {
        return this.mEditorAbsoluteY;
    }

    public void setEditorAbsoluteY(int i) {
        this.mEditorAbsoluteY = i;
    }

    public float getVerticalWeight() {
        return this.mVerticalWeight;
    }

    public void setVerticalWeight(float f) {
        this.mVerticalWeight = f;
    }

    public float getHorizontalWeight() {
        return this.mHorizontalWeight;
    }

    public void setHorizontalWeight(float f) {
        this.mHorizontalWeight = f;
    }

    public ChainMode getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setHorizontalChainStyle(ChainMode chainMode) {
        this.mHorizontalChainStyle = chainMode;
    }

    public ChainMode getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public void setVerticalChainStyle(ChainMode chainMode) {
        this.mVerticalChainStyle = chainMode;
    }

    public Behaviour getWidthDefault() {
        return this.mWidthDefault;
    }

    public void setWidthDefault(Behaviour behaviour) {
        this.mWidthDefault = behaviour;
    }

    public Behaviour getHeightDefault() {
        return this.mHeightDefault;
    }

    public void setHeightDefault(Behaviour behaviour) {
        this.mHeightDefault = behaviour;
    }

    public int getWidthMax() {
        return this.mWidthMax;
    }

    public void setWidthMax(int i) {
        this.mWidthMax = i;
    }

    public int getHeightMax() {
        return this.mHeightMax;
    }

    public void setHeightMax(int i) {
        this.mHeightMax = i;
    }

    public int getWidthMin() {
        return this.mWidthMin;
    }

    public void setWidthMin(int i) {
        this.mWidthMin = i;
    }

    public int getHeightMin() {
        return this.mHeightMin;
    }

    public void setHeightMin(int i) {
        this.mHeightMin = i;
    }

    public float getWidthPercent() {
        return this.mWidthPercent;
    }

    public void setWidthPercent(float f) {
        this.mWidthPercent = f;
    }

    public float getHeightPercent() {
        return this.mHeightPercent;
    }

    public void setHeightPercent(float f) {
        this.mHeightPercent = f;
    }

    public String[] getReferenceIds() {
        return this.mReferenceIds;
    }

    public void setReferenceIds(String[] strArr) {
        this.mReferenceIds = strArr;
    }

    public boolean isConstrainedWidth() {
        return this.mConstrainedWidth;
    }

    public void setConstrainedWidth(boolean z) {
        this.mConstrainedWidth = z;
    }

    public boolean isConstrainedHeight() {
        return this.mConstrainedHeight;
    }

    public void setConstrainedHeight(boolean z) {
        this.mConstrainedHeight = z;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void linkToTop(VAnchor vAnchor) {
        linkToTop(vAnchor, 0);
    }

    public void linkToLeft(HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToRight(HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToStart(HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToEnd(HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToBottom(VAnchor vAnchor) {
        linkToBottom(vAnchor, 0);
    }

    public void linkToBaseline(VAnchor vAnchor) {
        linkToBaseline(vAnchor, 0);
    }

    public void linkToTop(VAnchor vAnchor, int i) {
        linkToTop(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToLeft(HAnchor hAnchor, int i) {
        linkToLeft(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToRight(HAnchor hAnchor, int i) {
        linkToRight(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToStart(HAnchor hAnchor, int i) {
        linkToStart(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToEnd(HAnchor hAnchor, int i) {
        linkToEnd(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToBottom(VAnchor vAnchor, int i) {
        linkToBottom(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToBaseline(VAnchor vAnchor, int i) {
        linkToBaseline(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToTop(VAnchor vAnchor, int i, int i2) {
        this.mTop.mConnection = vAnchor;
        this.mTop.mMargin = i;
        this.mTop.mGoneMargin = i2;
    }

    public void linkToLeft(HAnchor hAnchor, int i, int i2) {
        this.mLeft.mConnection = hAnchor;
        this.mLeft.mMargin = i;
        this.mLeft.mGoneMargin = i2;
    }

    public void linkToRight(HAnchor hAnchor, int i, int i2) {
        this.mRight.mConnection = hAnchor;
        this.mRight.mMargin = i;
        this.mRight.mGoneMargin = i2;
    }

    public void linkToStart(HAnchor hAnchor, int i, int i2) {
        this.mStart.mConnection = hAnchor;
        this.mStart.mMargin = i;
        this.mStart.mGoneMargin = i2;
    }

    public void linkToEnd(HAnchor hAnchor, int i, int i2) {
        this.mEnd.mConnection = hAnchor;
        this.mEnd.mMargin = i;
        this.mEnd.mGoneMargin = i2;
    }

    public void linkToBottom(VAnchor vAnchor, int i, int i2) {
        this.mBottom.mConnection = vAnchor;
        this.mBottom.mMargin = i;
        this.mBottom.mGoneMargin = i2;
    }

    public void linkToBaseline(VAnchor vAnchor, int i, int i2) {
        this.mBaseline.mConnection = vAnchor;
        this.mBaseline.mMargin = i;
        this.mBaseline.mGoneMargin = i2;
    }

    public String convertStringArrayToString(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (i < strArr.length) {
            sb.append(i == 0 ? "'" : ",'");
            sb.append(strArr[i]);
            sb.append("'");
            i++;
        }
        sb.append("]");
        return sb.toString();
    }

    protected void append(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f);
        sb.append(",\n");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mId);
        sb.append(":{\n");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        this.mLeft.build(sb2);
        this.mRight.build(sb2);
        this.mTop.build(sb2);
        this.mBottom.build(sb2);
        this.mStart.build(sb2);
        this.mEnd.build(sb2);
        this.mBaseline.build(sb2);
        if (this.mWidth != UNSET) {
            sb2.append("width:");
            sb2.append(this.mWidth);
            sb2.append(",\n");
        }
        if (this.mHeight != UNSET) {
            sb2.append("height:");
            sb2.append(this.mHeight);
            sb2.append(",\n");
        }
        append(sb2, "horizontalBias", this.mHorizontalBias);
        append(sb2, "verticalBias", this.mVerticalBias);
        if (this.mDimensionRatio != null) {
            sb2.append("dimensionRatio:'");
            sb2.append(this.mDimensionRatio);
            sb2.append("',\n");
        }
        if (this.mCircleConstraint != null && (!Float.isNaN(this.mCircleAngle) || this.mCircleRadius != Integer.MIN_VALUE)) {
            sb2.append("circular:['");
            sb2.append(this.mCircleConstraint);
            sb2.append("'");
            if (!Float.isNaN(this.mCircleAngle)) {
                sb2.append(",");
                sb2.append(this.mCircleAngle);
            }
            if (this.mCircleRadius != Integer.MIN_VALUE) {
                if (Float.isNaN(this.mCircleAngle)) {
                    sb2.append(",0,");
                    sb2.append(this.mCircleRadius);
                } else {
                    sb2.append(",");
                    sb2.append(this.mCircleRadius);
                }
            }
            sb2.append("],\n");
        }
        append(sb2, "verticalWeight", this.mVerticalWeight);
        append(sb2, "horizontalWeight", this.mHorizontalWeight);
        if (this.mHorizontalChainStyle != null) {
            sb2.append("horizontalChainStyle:'");
            sb2.append(chainModeMap.get(this.mHorizontalChainStyle));
            sb2.append("',\n");
        }
        if (this.mVerticalChainStyle != null) {
            sb2.append("verticalChainStyle:'");
            sb2.append(chainModeMap.get(this.mVerticalChainStyle));
            sb2.append("',\n");
        }
        if (this.mWidthDefault != null) {
            int i = this.mWidthMax;
            int i2 = UNSET;
            if (i == i2 && this.mWidthMin == i2) {
                sb2.append("width:'");
                sb2.append(this.mWidthDefault.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("width:{value:'");
                sb2.append(this.mWidthDefault.toString().toLowerCase());
                sb2.append("'");
                if (this.mWidthMax != UNSET) {
                    sb2.append(",max:");
                    sb2.append(this.mWidthMax);
                }
                if (this.mWidthMin != UNSET) {
                    sb2.append(",min:");
                    sb2.append(this.mWidthMin);
                }
                sb2.append("},\n");
            }
        }
        if (this.mHeightDefault != null) {
            int i3 = this.mHeightMax;
            int i4 = UNSET;
            if (i3 == i4 && this.mHeightMin == i4) {
                sb2.append("height:'");
                sb2.append(this.mHeightDefault.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("height:{value:'");
                sb2.append(this.mHeightDefault.toString().toLowerCase());
                sb2.append("'");
                if (this.mHeightMax != UNSET) {
                    sb2.append(",max:");
                    sb2.append(this.mHeightMax);
                }
                if (this.mHeightMin != UNSET) {
                    sb2.append(",min:");
                    sb2.append(this.mHeightMin);
                }
                sb2.append("},\n");
            }
        }
        if (!Double.isNaN(this.mWidthPercent)) {
            sb2.append("width:'");
            sb2.append((int) this.mWidthPercent);
            sb2.append("%',\n");
        }
        if (!Double.isNaN(this.mHeightPercent)) {
            sb2.append("height:'");
            sb2.append((int) this.mHeightPercent);
            sb2.append("%',\n");
        }
        if (this.mReferenceIds != null) {
            sb2.append("referenceIds:");
            sb2.append(convertStringArrayToString(this.mReferenceIds));
            sb2.append(",\n");
        }
        if (this.mConstrainedWidth) {
            sb2.append("constrainedWidth:");
            sb2.append(this.mConstrainedWidth);
            sb2.append(",\n");
        }
        if (this.mConstrainedHeight) {
            sb2.append("constrainedHeight:");
            sb2.append(this.mConstrainedHeight);
            sb2.append(",\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }
}
