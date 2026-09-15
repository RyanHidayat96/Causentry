package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class OutputSurfaceConfiguration extends withDefaultBehavior {
    @Override // defpackage.QuirkSettings1
    protected final int b(int i) {
        return i < 10000 ? i : i - 10000;
    }

    public OutputSurfaceConfiguration(getFlashType getflashtype) {
        super(getflashtype);
    }

    @Override // defpackage.QuirkSettings1
    protected final void b(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }
}
