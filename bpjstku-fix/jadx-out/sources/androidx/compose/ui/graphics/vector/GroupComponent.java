package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.constraintlayout.motion.widget.Key;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0006*\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R$\u0010+\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R6\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002000/8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00107\u001a\u00020'8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010*R\u0016\u00108\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010)R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010<8\u0011@\u0011X\u0091\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010>R*\u0010D\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001e8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010 \"\u0004\bG\u0010HR*\u0010J\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020I8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR*\u0010P\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020I8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR*\u0010S\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020I8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010K\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR*\u0010V\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020I8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010K\u001a\u0004\bW\u0010M\"\u0004\bX\u0010OR*\u0010Y\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020I8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010K\u001a\u0004\bZ\u0010M\"\u0004\b[\u0010OR*\u0010\\\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020I8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010K\u001a\u0004\b]\u0010M\"\u0004\b^\u0010OR*\u0010_\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020I8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010K\u001a\u0004\b`\u0010M\"\u0004\ba\u0010OR\u0011\u0010d\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010)"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "Landroidx/compose/ui/graphics/Brush;", "p0", "", "markTintForBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "Landroidx/compose/ui/graphics/Color;", "markTintForColor-8_81llA", "(J)V", "markTintForColor", "markTintForVNode", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "markNotTintable", "updateClipPath", "updateMatrix", "", "p1", "insertAt", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", "p2", "move", "(III)V", "remove", "(II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Matrix;", "groupMatrix", "[F", "", "children", "Ljava/util/List;", "", "isTintable", "Z", "()Z", "tintColor", "J", "getTintColor-0d7_KjU", "()J", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "getWillClipPath", "willClipPath", "isClipPathDirty", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "Lkotlin/Function1;", "invalidateListener", "Lkotlin/jvm/functions/Function1;", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function1;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "wrappedListener", "name", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "", Key.ROTATION, "F", "getRotation", "()F", "setRotation", "(F)V", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "getNumChildren", "()I", "numChildren", "isMatrixDirty"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupComponent extends VNode {
    public static final int $stable = 8;
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private Function1<? super VNode, Unit> invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;
    private final Function1<VNode, Unit> wrappedListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.INSTANCE.m4254getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new Function1<VNode, Unit>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(VNode vNode) {
                invoke2(vNode);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(VNode vNode) {
                this.this$0.markTintForVNode(vNode);
                Function1<VNode, Unit> invalidateListener$ui_release = this.this$0.getInvalidateListener$ui_release();
                if (invalidateListener$ui_release != null) {
                    invalidateListener$ui_release.invoke(vNode);
                }
            }

            {
                super(1);
            }
        };
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    /* JADX INFO: renamed from: isTintable, reason: from getter */
    public final boolean getIsTintable() {
        return this.isTintable;
    }

    /* JADX INFO: renamed from: getTintColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    private final void markTintForBrush(Brush p0) {
        if (!this.isTintable || p0 == null) {
            return;
        }
        if (p0 instanceof SolidColor) {
            m4948markTintForColor8_81llA(((SolidColor) p0).getValue());
        } else {
            markNotTintable();
        }
    }

    /* JADX INFO: renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m4948markTintForColor8_81llA(long p0) {
        if (!this.isTintable || p0 == 16) {
            return;
        }
        long j = this.tintColor;
        if (j == 16) {
            this.tintColor = p0;
        } else {
            if (VectorKt.m4971rgbEqualOWjLjI(j, p0)) {
                return;
            }
            markNotTintable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markTintForVNode(VNode p0) {
        if (p0 instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) p0;
            markTintForBrush(pathComponent.getFill());
            markTintForBrush(pathComponent.getStroke());
        } else if (p0 instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) p0;
            if (groupComponent.isTintable && this.isTintable) {
                m4948markTintForColor8_81llA(groupComponent.tintColor);
            } else {
                markNotTintable();
            }
        }
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.INSTANCE.m4254getUnspecified0d7_KjU();
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public final void setClipPathData(List<? extends PathNode> list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final Function1<VNode, Unit> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void setInvalidateListener$ui_release(Function1<? super VNode, Unit> function1) {
        this.invalidateListener = function1;
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            Path Path = this.clipPath;
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
                this.clipPath = Path;
            }
            PathParserKt.toPath(this.clipPathData, Path);
        }
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
        invalidate();
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final void setRotation(float f) {
        this.rotation = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    private final void updateMatrix() {
        float[] fArrM4461constructorimpl$default = this.groupMatrix;
        if (fArrM4461constructorimpl$default == null) {
            fArrM4461constructorimpl$default = Matrix.m4461constructorimpl$default(null, 1, null);
            this.groupMatrix = fArrM4461constructorimpl$default;
        } else {
            Matrix.m4470resetimpl(fArrM4461constructorimpl$default);
        }
        float f = this.translationX;
        Matrix.m4483translateimpl$default(fArrM4461constructorimpl$default, this.pivotX + f, this.translationY + this.pivotY, 0.0f, 4, null);
        Matrix.m4475rotateZimpl(fArrM4461constructorimpl$default, this.rotation);
        Matrix.m4476scaleimpl(fArrM4461constructorimpl$default, this.scaleX, this.scaleY, 1.0f);
        Matrix.m4483translateimpl$default(fArrM4461constructorimpl$default, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    public final void insertAt(int p0, VNode p1) {
        if (p0 < getNumChildren()) {
            this.children.set(p0, p1);
        } else {
            this.children.add(p1);
        }
        markTintForVNode(p1);
        p1.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
    }

    public final void move(int p0, int p1, int p2) {
        int i = 0;
        if (p0 > p1) {
            while (i < p2) {
                VNode vNode = this.children.get(p0);
                this.children.remove(p0);
                this.children.add(p1, vNode);
                p1++;
                i++;
            }
        } else {
            while (i < p2) {
                VNode vNode2 = this.children.get(p0);
                this.children.remove(p0);
                this.children.add(p1 - 1, vNode2);
                i++;
            }
        }
        invalidate();
    }

    public final void remove(int p0, int p1) {
        for (int i = 0; i < p1; i++) {
            if (p0 < this.children.size()) {
                this.children.get(p0).setInvalidateListener$ui_release(null);
                this.children.remove(p0);
            }
        }
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void draw(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4719getSizeNHjbRc = drawContext.mo4719getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.mo4727transform58bKbWc((fArr != null ? Matrix.m4459boximpl(fArr) : null).m4484unboximpl());
            }
            Path path = this.clipPath;
            if (getWillClipPath() && path != null) {
                DrawTransform.m4854clipPathmtrdDE$default(transform, path, 0, 2, null);
            }
            List<VNode> list = this.children;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).draw(drawScope);
            }
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VNode vNode = list.get(i);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
