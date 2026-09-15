package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.ExecutorDelivery;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import defpackage.ViewPortBuilder;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private CalendarConstraints calendarConstraints;
    private CalendarSelector calendarSelector;
    private CalendarStyle calendarStyle;
    private Month current;
    private DateSelector<S> dateSelector;
    private View dayFrame;
    private DayViewDecorator dayViewDecorator;
    private View monthNext;
    private View monthPrev;
    private RecyclerView recyclerView;
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;
    static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
    static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
    static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    enum CalendarSelector {
        DAY,
        YEAR
    }

    interface OnDayClickListener {
        void onDayClick(long j);
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i, calendarConstraints, null);
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, this.dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.dayViewDecorator = (DayViewDecorator) bundle.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        final int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        viewInflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
        int firstDayOfWeek = this.calendarConstraints.getFirstDayOfWeek();
        gridView.setAdapter((ListAdapter) (firstDayOfWeek > 0 ? new DaysOfWeekAdapter(firstDayOfWeek) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i2, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                if (i2 == 0) {
                    iArr[0] = MaterialCalendar.this.recyclerView.getWidth();
                    iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
                } else {
                    iArr[0] = MaterialCalendar.this.recyclerView.getHeight();
                    iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
                }
            }
        });
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, this.dayViewDecorator, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j) {
                if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j)) {
                    MaterialCalendar.this.dateSelector.select(j);
                    Iterator<OnSelectionChangedListener<S>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onSelectionChanged(MaterialCalendar.this.dateSelector.getSelection());
                    }
                    MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.yearSelector != null) {
                        MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(viewInflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        setUpForAccessibility();
        return viewInflate;
    }

    private void setUpForAccessibility() {
        ViewCompat.setAccessibilityDelegate(this.recyclerView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setScrollable(false);
            }
        });
    }

    private RecyclerView.ItemDecoration createItemDecoration() {
        return new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            private final Calendar startItem = UtcDates.getUtcCalendar();
            private final Calendar endItem = UtcDates.getUtcCalendar();

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
                int width;
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (Pair<Long, Long> pair : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        if (pair.first != null && pair.second != null) {
                            this.startItem.setTimeInMillis(pair.first.longValue());
                            this.endItem.setTimeInMillis(pair.second.longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            View viewFindViewByPosition = gridLayoutManager.findViewByPosition(positionForYear);
                            View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(positionForYear2);
                            int spanCount = positionForYear / gridLayoutManager.getSpanCount();
                            int spanCount2 = positionForYear2 / gridLayoutManager.getSpanCount();
                            int i = spanCount;
                            while (i <= spanCount2) {
                                View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i);
                                if (viewFindViewByPosition3 != null) {
                                    int top = viewFindViewByPosition3.getTop();
                                    int topInset = MaterialCalendar.this.calendarStyle.year.getTopInset();
                                    int bottom = viewFindViewByPosition3.getBottom();
                                    int bottomInset = MaterialCalendar.this.calendarStyle.year.getBottomInset();
                                    int left = (i != spanCount || viewFindViewByPosition == null) ? 0 : viewFindViewByPosition.getLeft() + (viewFindViewByPosition.getWidth() / 2);
                                    if (i == spanCount2 && viewFindViewByPosition2 != null) {
                                        width = viewFindViewByPosition2.getLeft() + (viewFindViewByPosition2.getWidth() / 2);
                                    } else {
                                        width = recyclerView.getWidth();
                                    }
                                    canvas.drawRect(left, top + topInset, width, bottom - bottomInset, MaterialCalendar.this.calendarStyle.rangeFill);
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        };
    }

    final Month getCurrentMonth() {
        return this.current;
    }

    final CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    final void setCurrentMonth(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        int position = monthsPagerAdapter.getPosition(month);
        int position2 = position - monthsPagerAdapter.getPosition(this.current);
        boolean z = Math.abs(position2) > 3;
        boolean z2 = position2 > 0;
        this.current = month;
        if (z && z2) {
            this.recyclerView.scrollToPosition(position - 3);
            postSmoothRecyclerViewScroll(position);
        } else if (z) {
            this.recyclerView.scrollToPosition(position + 3);
            postSmoothRecyclerViewScroll(position);
        } else {
            postSmoothRecyclerViewScroll(position);
        }
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    final CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    static int getDayHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    final void setSelector(CalendarSelector calendarSelector) {
        this.calendarSelector = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((YearGridAdapter) this.yearSelector.getAdapter()).getPositionForYear(this.current.year));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
            this.monthPrev.setVisibility(8);
            this.monthNext.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            this.monthPrev.setVisibility(0);
            this.monthNext.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    final void toggleVisibleSelector() {
        if (this.calendarSelector == CalendarSelector.YEAR) {
            setSelector(CalendarSelector.DAY);
        } else if (this.calendarSelector == CalendarSelector.DAY) {
            setSelector(CalendarSelector.YEAR);
        }
    }

    private void addActionsToMonthNavigation(View view, final MonthsPagerAdapter monthsPagerAdapter) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        ViewCompat.setAccessibilityDelegate(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                String string;
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (MaterialCalendar.this.dayFrame.getVisibility() == 0) {
                    string = MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                accessibilityNodeInfoCompat.setHintText(string);
            }
        });
        View viewFindViewById = view.findViewById(R.id.month_navigation_previous);
        this.monthPrev = viewFindViewById;
        viewFindViewById.setTag(NAVIGATION_PREV_TAG);
        View viewFindViewById2 = view.findViewById(R.id.month_navigation_next);
        this.monthNext = viewFindViewById2;
        viewFindViewById2.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        setSelector(CalendarSelector.DAY);
        materialButton.setText(this.current.getLongName());
        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int iFindLastVisibleItemPosition;
                if (i < 0) {
                    iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition();
                } else {
                    iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition();
                }
                MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(iFindLastVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.getPageTitle(iFindLastVisibleItemPosition));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            private static final byte[] $$a = {29, 88, -118, 32};
            private static final int $$b = 235;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {59682, 59743, 59714, 59723, 59708, 59715, 59757, 59751, 59771, 59744, 59746, 59740, 59700, 59725, 59702, 59714, 59749, 59744, 59752, 59743, 59705, 59721, 59757, 59751, 59771, 59744, 59746, 59740, 59700, 59726, 59715, 59704, 59749, 59744, 59752, 59743, 59705, 59721, 59757, 59751, 59771, 59744, 59746, 59740, 59700, 59726, 59715, 59708, 59715, 59757, 59751, 59771, 59744, 59746, 59740, 59700, 59725, 59702, 59700, 59743, 59714, 59723, 59398, 59882, 59847, 59417, 59399, 59400, 59417, 59399, 59398, 59402, 59847, 59401, 59404, 59398, 59419, 59401, 59399, 59892, 59417, 59421, 59400, 59417, 59399, 59807, 59434, 59415, 59409, 59414, 59414, 59398, 59396, 59415, 59409, 59415, 59414, 59411, 59397, 59411, 59433, 59415, 59698, 59744, 59757, 59759, 59756, 59756, 59740, 59730, 59757, 59759, 59757, 59756, 59753, 59731, 59700, 59718, 59749, 59716, 59738, 59770, 59746, 59751, 59770, 59749, 59746, 59715, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59700, 59762, 59762, 59745, 59757, 59774, 59768, 59774, 59773, 59770, 59756, 59717, 59735, 59766, 59733, 59755, 59787, 59763, 59760, 59787, 59766, 59763, 59740, 59731, 59774, 59760, 59764, 59761, 59763, 59773, 59698, 59744, 59751, 59768, 59749, 59747, 59745, 59756, 59745, 59775, 59788, 59396, 59405, 59400, 59407, 59403, 59401, 59401, 59395, 59889, 59900, 59711, 59750, 59768, 59751, 59759, 59751, 59739, 59724, 59744, 59744, 59758, 59756, 59751, 59745, 59753, 59757, 59756, 59756, 59749, 59768, 59744, 59743, 59701, 59711, 59705, 59725, 59720, 59738, 59768, 59744, 59759, 59715, 59736, 59773};
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60047, 60067, 60035, 60054, 60061, 60082, 60062, 60041, 60049, 60048, 60040, 60057, 60055, 60110, 60085, 60052, 60053, 60045, 60058, 60090, 60093, 60117, 60051, 60034, 60088, 60089, 60063, 60056, 60046, 60043, 60072, 60107, 60050, 60060, 60075, 60098};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57191;

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                char[] cArr;
                int i = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i2 = 0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iArr[2];
                int i6 = iArr[3];
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j = 0;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i2] = Integer.valueOf(cArr2[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i2;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), 1270 - ExpandableListView.getPackedPositionType(j), 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 407021364, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i7++;
                            int i8 = $11 + 5;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            i2 = 0;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                char[] cArr4 = new char[i4];
                System.arraycopy(cArr2, i3, cArr4, 0, i4);
                if (bArr != null) {
                    int i10 = $10 + 105;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    char[] cArr5 = new char[i4];
                    setvideostabilizationmode.b = 0;
                    char c = 0;
                    while (setvideostabilizationmode.b < i4) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i12 = setvideostabilizationmode.b;
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.argb(0, 0, 0, 0), 3225 - (Process.myTid() >> 22), 13 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2133916302, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            int i13 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - ExpandableListView.getPackedPositionGroup(0L)), 1755 - TextUtils.getCapsMode("", 0, 0), 23 - View.getDefaultSize(0, 0), 387247676, false, $$c(b6, b7, (byte) (b7 - 2)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        }
                        c = cArr5[setvideostabilizationmode.b];
                        Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1704, 22 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1434471773, false, $$c(b8, (byte) (b8 | 6), b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    cArr4 = cArr5;
                }
                if (i6 > 0) {
                    int i14 = $11 + 7;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    char[] cArr6 = new char[i4];
                    System.arraycopy(cArr4, 0, cArr6, 0, i4);
                    int i16 = i4 - i6;
                    System.arraycopy(cArr6, 0, cArr4, i16, i6);
                    System.arraycopy(cArr6, i6, cArr4, 0, i16);
                }
                if (z) {
                    int i17 = $10 + 119;
                    $11 = i17 % 128;
                    if (i17 % 2 == 0) {
                        cArr = new char[i4];
                        setvideostabilizationmode.b = 0;
                    } else {
                        cArr = new char[i4];
                        setvideostabilizationmode.b = 0;
                    }
                    while (setvideostabilizationmode.b < i4) {
                        cArr[setvideostabilizationmode.b] = cArr4[(i4 - setvideostabilizationmode.b) - 1];
                        setvideostabilizationmode.b++;
                    }
                    int i18 = $11 + 123;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        int i19 = 2 % 5;
                    }
                    cArr4 = cArr;
                }
                if (i5 > 0) {
                    int i20 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i20;
                        if (setvideostabilizationmode.b >= i4) {
                            break;
                        }
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                        i20 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr4);
            }

            private static void c(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
                int i2;
                Object obj;
                int i3 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object obj2 = null;
                int i4 = 8;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i5 = 0;
                    while (i5 < length) {
                        int i6 = $11 + 105;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarSize() >> i4) + 2267, 32 - ((byte) KeyEvent.getModifierMetaStateMask()), -1927765101, false, $$c(b3, (byte) (b3 | 14), b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i5++;
                            i4 = 8;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 2267, 33 - View.getDefaultSize(0, 0), -1927765101, false, $$c(b4, (byte) (b4 | 14), b4), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i8 = $10 + 123;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr4[i] = (char) (cArr[i] << b2);
                        i2 = i;
                    } else {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b2);
                    }
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            int i9 = $11 + 119;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49267), 3261 - ExpandableListView.getPackedPositionGroup(0L), 30 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -127612708, false, $$c(b5, (byte) (b5 | 15), b5), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                                int i11 = $11 + 119;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b6 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 595 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 18, 1570859318, false, $$c(b6, (byte) (b6 | 17), b6), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                                int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                } else {
                                    int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                }
                            }
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        obj2 = obj;
                    }
                }
                for (int i18 = 0; i18 < i; i18++) {
                    cArr4[i18] = (char) (cArr4[i18] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int i = 2 % 2;
                int i2 = b + 91;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    MaterialCalendar.this.toggleVisibleSelector();
                    ViewPortBuilder.b();
                    int i4 = TuitionPaymentFragmentbindingInflater1 + 61;
                    b = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 20 / 0;
                    }
                } catch (Throwable th) {
                    ViewPortBuilder.b();
                    throw th;
                }
            }

            /* JADX WARN: Code duplicated, block: B:131:0x0a7f A[Catch: all -> 0x0abe, TryCatch #14 {all -> 0x0abe, blocks: (B:111:0x0a4b, B:114:0x0a54, B:116:0x0a5e, B:117:0x0a5f, B:119:0x0a61, B:121:0x0a6b, B:122:0x0a6c, B:129:0x0a79, B:131:0x0a7f, B:132:0x0a80, B:134:0x0a82, B:136:0x0a89, B:137:0x0a8a, B:139:0x0a8c, B:141:0x0a93, B:142:0x0a94, B:144:0x0a96, B:146:0x0a9d, B:147:0x0a9e, B:149:0x0aa0, B:151:0x0aa7, B:152:0x0aa8, B:154:0x0aaa, B:156:0x0ab1, B:157:0x0ab2, B:159:0x0ab4, B:161:0x0abb, B:162:0x0abc, B:71:0x070e, B:73:0x0736, B:75:0x0766, B:81:0x07d2, B:43:0x0402, B:49:0x04a7, B:55:0x0515, B:13:0x008d, B:19:0x0108, B:29:0x021c, B:36:0x02cc, B:38:0x0323, B:83:0x07fb, B:6:0x002e, B:9:0x0062, B:11:0x0077, B:10:0x006d, B:27:0x01a0, B:23:0x0147, B:25:0x018a, B:24:0x0167), top: B:188:0x002e, inners: #0, #1, #3, #4, #9, #10, #11, #15 }] */
            /* JADX WARN: Code duplicated, block: B:132:0x0a80 A[Catch: all -> 0x0abe, TryCatch #14 {all -> 0x0abe, blocks: (B:111:0x0a4b, B:114:0x0a54, B:116:0x0a5e, B:117:0x0a5f, B:119:0x0a61, B:121:0x0a6b, B:122:0x0a6c, B:129:0x0a79, B:131:0x0a7f, B:132:0x0a80, B:134:0x0a82, B:136:0x0a89, B:137:0x0a8a, B:139:0x0a8c, B:141:0x0a93, B:142:0x0a94, B:144:0x0a96, B:146:0x0a9d, B:147:0x0a9e, B:149:0x0aa0, B:151:0x0aa7, B:152:0x0aa8, B:154:0x0aaa, B:156:0x0ab1, B:157:0x0ab2, B:159:0x0ab4, B:161:0x0abb, B:162:0x0abc, B:71:0x070e, B:73:0x0736, B:75:0x0766, B:81:0x07d2, B:43:0x0402, B:49:0x04a7, B:55:0x0515, B:13:0x008d, B:19:0x0108, B:29:0x021c, B:36:0x02cc, B:38:0x0323, B:83:0x07fb, B:6:0x002e, B:9:0x0062, B:11:0x0077, B:10:0x006d, B:27:0x01a0, B:23:0x0147, B:25:0x018a, B:24:0x0167), top: B:188:0x002e, inners: #0, #1, #3, #4, #9, #10, #11, #15 }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v26 */
            /* JADX WARN: Type inference failed for: r12v36 */
            /* JADX WARN: Type inference failed for: r12v47 */
            /* JADX WARN: Type inference failed for: r12v55 */
            /* JADX WARN: Type inference failed for: r12v64 */
            /* JADX WARN: Type inference failed for: r13v36 */
            /* JADX WARN: Type inference failed for: r14v106 */
            /* JADX WARN: Type inference failed for: r14v38 */
            /* JADX WARN: Type inference failed for: r14v51 */
            /* JADX WARN: Type inference failed for: r15v24 */
            /* JADX WARN: Type inference failed for: r15v27 */
            /* JADX WARN: Type inference failed for: r15v34 */
            /* JADX WARN: Type inference failed for: r15v38 */
            /* JADX WARN: Type inference failed for: r15v81 */
            /* JADX WARN: Type inference failed for: r15v83 */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v2, types: [int] */
            /* JADX WARN: Type inference failed for: r1v38 */
            /* JADX WARN: Type inference failed for: r1v39 */
            /* JADX WARN: Type inference failed for: r1v40 */
            /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r1v46 */
            /* JADX WARN: Type inference failed for: r1v48 */
            /* JADX WARN: Type inference failed for: r1v56 */
            /* JADX WARN: Type inference failed for: r1v57 */
            /* JADX WARN: Type inference failed for: r1v63 */
            /* JADX WARN: Type inference failed for: r20v6 */
            /* JADX WARN: Type inference failed for: r21v1 */
            /* JADX WARN: Type inference failed for: r21v7 */
            /* JADX WARN: Type inference failed for: r24v7 */
            /* JADX WARN: Type inference failed for: r2v69 */
            /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r3v18 */
            /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
            /* JADX WARN: Type inference failed for: r3v25 */
            /* JADX WARN: Type inference failed for: r3v63 */
            /* JADX WARN: Type inference failed for: r3v91 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v2, types: [int] */
            /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r5v3 */
            /* JADX WARN: Type inference failed for: r5v30 */
            /* JADX WARN: Type inference failed for: r5v4, types: [int] */
            /* JADX WARN: Type inference failed for: r5v43 */
            /* JADX WARN: Type inference failed for: r5v51 */
            /* JADX WARN: Type inference failed for: r5v52 */
            /* JADX WARN: Type inference failed for: r5v53 */
            /* JADX WARN: Type inference failed for: r5v54 */
            /* JADX WARN: Type inference failed for: r5v6 */
            /* JADX WARN: Type inference failed for: r5v9, types: [int] */
            /* JADX WARN: Type inference failed for: r6v2, types: [int[]] */
            /* JADX WARN: Type inference failed for: r8v20 */
            /* JADX WARN: Type inference failed for: r8v5 */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2) {
                Constructor<?> declaredConstructor;
                int i3;
                Class<?> cls;
                int[] iArr;
                byte[] bArr;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                Throwable cause;
                int i11;
                char[] cArr;
                int i12;
                int i13;
                int i14;
                int i15;
                ?? r1 = i;
                int i16 = i2;
                int i17 = 2 % 2;
                int i18 = b;
                int i19 = (i18 ^ 61) + ((i18 & 61) << 1);
                TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                ?? r5 = i19 % 2;
                if (context != null) {
                    try {
                        Object[] objArr = new Object[1];
                        a(new int[]{0, 31, 0, 0}, true, new byte[]{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1}, objArr);
                        try {
                            try {
                                Object[] objArr2 = {(String) objArr[0]};
                                Object[] objArr3 = new Object[1];
                                c(AndroidCharacter.getMirror('0') - '\n', new char[]{6, 20, '\f', 23, 3, 20, 11, 7, 28, 29, '\b', 31, 5, 18, 22, 19, 24, 4, 23, 22, 1, 14, 13845, 13845, 19, 3, 19, 1, ' ', '#', '\b', 31, 15, 28, '#', 26, 24, 18}, (byte) (106 - MotionEvent.axisFromString("")), objArr3);
                                Class<?> cls2 = Class.forName((String) objArr3[0]);
                                int i20 = TuitionPaymentFragmentbindingInflater1 + 93;
                                b = i20 % 128;
                                if (i20 % 2 == 0) {
                                    Class<?>[] clsArr = new Class[0];
                                    clsArr[0] = String.class;
                                    declaredConstructor = cls2.getDeclaredConstructor(clsArr);
                                } else {
                                    declaredConstructor = cls2.getDeclaredConstructor(String.class);
                                }
                                Object objNewInstance = declaredConstructor.newInstance(objArr2);
                                Object[] objArr4 = new Object[1];
                                a(new int[]{31, 31, 0, 31}, true, new byte[]{1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0}, objArr4);
                                try {
                                    Object[] objArr5 = {(String) objArr4[0]};
                                    int i21 = -View.MeasureSpec.getSize(0);
                                    int i22 = (i21 & 38) + (i21 | 38);
                                    char[] cArr2 = {6, 20, '\f', 23, 3, 20, 11, 7, 28, 29, '\b', 31, 5, 18, 22, 19, 24, 4, 23, 22, 1, 14, 13845, 13845, 19, 3, 19, 1, ' ', '#', '\b', 31, 15, 28, '#', 26, 24, 18};
                                    int i23 = -ImageFormat.getBitsPerPixel(0);
                                    int i24 = b;
                                    int i25 = ((i24 | 97) << 1) - (i24 ^ 97);
                                    int i26 = i25 % 128;
                                    TuitionPaymentFragmentbindingInflater1 = i26;
                                    int i27 = i25 % 2;
                                    int i28 = (i23 * 221) - 23214;
                                    int i29 = ~i23;
                                    int i30 = ~((i29 ^ (-107)) | (i29 & (-107)));
                                    r5 = ~r1;
                                    int i31 = i26 + 1;
                                    b = i31 % 128;
                                    int i32 = r5 ^ i23;
                                    if (i31 % 2 == 0) {
                                        int i33 = i32 | (r5 & i23);
                                        i3 = i28 << ((i30 | (~((i33 & 106) | (i33 ^ 106)))) * 220);
                                    } else {
                                        int i34 = i32 | (r5 & i23);
                                        int i35 = ~((i34 & 106) | (i34 ^ 106));
                                        i3 = (((i30 & i35) | (i30 ^ i35)) * 220) + i28;
                                    }
                                    int i36 = ~((r5 ^ 106) | (r5 & 106));
                                    int i37 = i3 + ((-440) * ((i36 & i23) | (i23 ^ i36)));
                                    int i38 = -(-(((i23 ^ 106) | (i23 & 106) | r1) * 220));
                                    byte b2 = (byte) ((i37 ^ i38) + ((i37 & i38) << 1));
                                    Object[] objArr6 = new Object[1];
                                    c(i22, cArr2, b2, objArr6);
                                    Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                                    int i39 = TuitionPaymentFragmentbindingInflater1;
                                    int i40 = ((i39 | 51) << 1) - (i39 ^ 51);
                                    b = i40 % 128;
                                    int i41 = i40 % 2;
                                    int i42 = (i39 ^ 37) + ((i39 & 37) << 1);
                                    b = i42 % 128;
                                    try {
                                        if (i42 % 2 == 0) {
                                            Object[] objArr7 = new Object[1];
                                            a(new int[]{62, 23, 158, 18}, false, null, objArr7);
                                            cls = Class.forName((String) objArr7[0]);
                                            iArr = new int[]{85, 17, 182, 17};
                                            bArr = new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0};
                                        } else {
                                            Object[] objArr8 = new Object[1];
                                            a(new int[]{62, 23, 158, 18}, true, null, objArr8);
                                            cls = Class.forName((String) objArr8[0]);
                                            iArr = new int[]{85, 17, 182, 17};
                                            bArr = new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0};
                                        }
                                        Object[] objArr9 = new Object[1];
                                        a(iArr, true, bArr, objArr9);
                                        Object objInvoke = cls.getMethod((String) objArr9[0], null).invoke(context, null);
                                        try {
                                            Object[] objArr10 = new Object[1];
                                            a(new int[]{62, 23, 158, 18}, true, null, objArr10);
                                            Class<?> cls3 = Class.forName((String) objArr10[0]);
                                            int i43 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i44 = (i43 * 530) + 1058;
                                            int i45 = (i44 ^ 7420) + ((i44 & 7420) << 1);
                                            int i46 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i47 = ~((i46 ^ i43) | (i46 & i43));
                                            int i48 = ~((i43 ^ 14) | (i43 & 14));
                                            int i49 = -(-(((i47 ^ i48) | (i48 & i47)) * 529));
                                            Object[] objArr11 = new Object[1];
                                            c((((i45 | i49) << 1) - (i49 ^ i45)) + (((~((i43 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i43 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1))) | (-15)) * 529), new char[]{30, '\t', 4, 30, 21, 24, 6, 21, 30, '\t', '\f', 20, 0, '\t'}, (byte) (93 - TextUtils.getCapsMode("", 0, 0)), objArr11);
                                            Object objInvoke2 = cls3.getMethod((String) objArr11[0], null).invoke(context, null);
                                            int i50 = b;
                                            int i51 = (i50 & 27) + (i50 | 27);
                                            TuitionPaymentFragmentbindingInflater1 = i51 % 128;
                                            int i52 = i51 % 2;
                                            try {
                                                Object[] objArr12 = {objInvoke2, 64};
                                                Object[] objArr13 = new Object[1];
                                                a(new int[]{102, 33, 0, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr13);
                                                Class<?> cls4 = Class.forName((String) objArr13[0]);
                                                int i53 = -(Process.myTid() >> 22);
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i54 = i53 * 371;
                                                int i55 = ((i54 | 5194) << 1) - (i54 ^ 5194);
                                                int i56 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                int i57 = (-15) | i56;
                                                int i58 = TuitionPaymentFragmentbindingInflater1;
                                                int i59 = (i58 ^ 125) + ((i58 & 125) << 1);
                                                b = i59 % 128;
                                                if (i59 % 2 == 0) {
                                                    int i60 = ~i57;
                                                    int i61 = ~i53;
                                                    int i62 = ~((i61 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i61 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                                    i4 = i55 >>> ((-370) << ((i60 ^ i62) | (i62 & i60)));
                                                    i5 = ~((i61 ^ i56) | (i61 & i56));
                                                    i6 = ((-15) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-15) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                                } else {
                                                    int i63 = ~i57;
                                                    int i64 = ~((~i53) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                                    int i65 = -(-(((i63 & i64) | (i63 ^ i64)) * (-370)));
                                                    i4 = (i65 | i55) + (i55 & i65);
                                                    int i66 = ~i53;
                                                    i5 = ~((i66 & i56) | (i66 ^ i56));
                                                    i6 = (-15) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                                }
                                                int i67 = ~i6;
                                                int i68 = (i5 & i67) | (i5 ^ i67);
                                                int i69 = ~(i53 | 14);
                                                int i70 = -(-((-370) * ((i68 & i69) | (i68 ^ i69))));
                                                int i71 = ((i4 | i70) << 1) - (i4 ^ i70);
                                                int i72 = -(-((~((i53 ^ 14) | (i53 & 14))) * 370));
                                                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                                                char[] cArr3 = {30, '\t', 4, 30, 21, 24, 6, 21, 30, '\t', 4, 17, 3, 16};
                                                int i74 = -AndroidCharacter.getMirror('0');
                                                int i75 = (i74 * (-159)) - 25281;
                                                int i76 = ~i74;
                                                int i77 = ((i76 & 159) | (i76 ^ 159)) * 160;
                                                int i78 = ((i75 | i77) << 1) - (i75 ^ i77);
                                                int i79 = b;
                                                int i80 = (i79 & 19) + (i79 | 19);
                                                TuitionPaymentFragmentbindingInflater1 = i80 % 128;
                                                int i81 = i80 % 2;
                                                int i82 = ~r1;
                                                int i83 = ~((i82 ^ i74) | (i82 & i74));
                                                int i84 = ~((i74 & 159) | (i74 ^ 159));
                                                int i85 = -(-((-160) * ((i83 & i84) | (i83 ^ i84))));
                                                int i86 = (i78 & i85) + (i85 | i78);
                                                int i87 = ~(((-160) | r5) == true ? 1 : 0);
                                                int i88 = ((i74 & i87) | (i74 ^ i87)) * 160;
                                                Object[] objArr14 = new Object[1];
                                                c(i73, cArr3, (byte) ((i86 ^ i88) + ((i88 & i86) << 1)), objArr14);
                                                Object objInvoke3 = cls4.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                                Object[] objArr15 = new Object[1];
                                                a(new int[]{135, 30, 15, 0}, true, new byte[]{0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr15);
                                                Class<?> cls5 = Class.forName((String) objArr15[0]);
                                                Object[] objArr16 = new Object[1];
                                                a(new int[]{165, 10, 0, 3}, false, new byte[]{0, 1, 0, 0, 0, 0, 1, 1, 1, 1}, objArr16);
                                                Object[] objArr17 = (Object[]) cls5.getField((String) objArr16[0]).get(objInvoke3);
                                                int length = objArr17.length;
                                                int i89 = 0;
                                                r1 = r1;
                                                r5 = r5;
                                                while (true) {
                                                    if (i89 < length) {
                                                        Object obj = objArr17[i89];
                                                        int i90 = -TextUtils.getOffsetAfter("", 0);
                                                        int i91 = (i90 * (-813)) + 20808;
                                                        int i92 = ~((-52) | i90);
                                                        ?? r15 = i90 | r1;
                                                        Object[] objArr18 = objArr17;
                                                        int i93 = ~(r15 == true ? 1 : 0);
                                                        int i94 = -(-(((i92 ^ i93) | (i93 & i92)) * (-814)));
                                                        int i95 = (i91 & i94) + (i94 | i91);
                                                        int i96 = ~((((-52) & r5) == true ? 1 : 0) | (((-52) ^ r5) == true ? 1 : 0));
                                                        int i97 = ~i90;
                                                        int i98 = ~((i97 ^ 51) | (i97 & 51));
                                                        int i99 = (i96 ^ i98) | (i96 & i98);
                                                        int i100 = ~(r15 == true ? 1 : 0);
                                                        int i101 = ((i99 & i100) | (i99 ^ i100)) * 407;
                                                        int i102 = ((i95 | i101) << 1) - (i101 ^ i95);
                                                        int i103 = ~((i97 ^ 51) | (i97 & 51));
                                                        int i104 = ~(((i97 & r1) == true ? 1 : 0) | ((i97 ^ r1) == true ? 1 : 0));
                                                        int i105 = (i103 & i104) | (i103 ^ i104);
                                                        int i106 = ~((r1 ^ 51) | (r1 & 51));
                                                        byte b3 = (byte) (i102 + (((i105 & i106) | (i105 ^ i106)) * 407));
                                                        Object[] objArr19 = new Object[1];
                                                        c(4 - (~(ViewConfiguration.getFadingEdgeLength() >> 16)), new char[]{3, 19, 19, 1, 13782}, b3, objArr19);
                                                        try {
                                                            Object[] objArr20 = {(String) objArr19[0]};
                                                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                            int i107 = ~packedPositionGroup;
                                                            int i108 = ~((i107 ^ 37) | (i107 & 37));
                                                            int i109 = ~packedPositionGroup;
                                                            int i110 = ~(((i109 ^ r1) == true ? 1 : 0) | ((i109 & r1) == true ? 1 : 0));
                                                            int i111 = (((packedPositionGroup * 141) - 5143) - (~(-(-(((i108 ^ i110) | (i108 & i110)) * (-280)))))) - 1;
                                                            int i112 = b;
                                                            int i113 = (i112 & 13) + (i112 | 13);
                                                            int i114 = length;
                                                            TuitionPaymentFragmentbindingInflater1 = i113 % 128;
                                                            if (i113 % 2 != 0) {
                                                                int i115 = ~(((i107 ^ r1) == true ? 1 : 0) | ((i107 & r1) == true ? 1 : 0));
                                                                int i116 = ~((((-38) ^ r1) == true ? 1 : 0) | (((-38) & r1) == true ? 1 : 0));
                                                                i7 = i111 << (140 - ((i115 ^ i116) | (i115 & i116)));
                                                                int i117 = i109 | (-38);
                                                                i8 = ~((i117 & r1) | ((i117 ^ r1) == true ? 1 : 0));
                                                            } else {
                                                                int i118 = ~((i107 | r1) == true ? 1 : 0);
                                                                int i119 = ~((((-38) ^ r1) == true ? 1 : 0) | (((-38) & r1) == true ? 1 : 0));
                                                                int i120 = -(-(((i118 ^ i119) | (i118 & i119)) * 140));
                                                                i7 = (i120 | i111) + (i111 & i120);
                                                                int i121 = i107 | (-38);
                                                                i8 = ~((i121 & r1) | ((i121 ^ r1) == true ? 1 : 0));
                                                                i107 = i109;
                                                            }
                                                            int i122 = i112 + 119;
                                                            TuitionPaymentFragmentbindingInflater1 = i122 % 128;
                                                            int i123 = i122 % 2;
                                                            int i124 = (i107 & i82) | (i107 ^ i82);
                                                            int i125 = ~((i124 & 37) | (i124 ^ 37));
                                                            int i126 = (i8 & i125) | (i8 ^ i125);
                                                            ?? r12 = (-38) | r5;
                                                            int i127 = 140 * ((~((packedPositionGroup & (r12 == true ? 1 : 0)) | ((r12 == true ? 1 : 0) ^ packedPositionGroup))) | i126);
                                                            int i128 = (i7 ^ i127) + ((i7 & i127) << 1);
                                                            char[] cArr4 = {6, 20, '\f', 23, 22, '\t', '\t', 24, 25, '\n', 30, 2, 18, 22, 24, '\t', 6, 1, 18, 27, 7, '\b', 2, 30, 2, Typography.quote, 24, 21, 6, '\f', 21, 19, 24, 3, '\r', '\t', 13841};
                                                            double dConvertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                                            int i129 = b + 89;
                                                            TuitionPaymentFragmentbindingInflater1 = i129 % 128;
                                                            if (i129 % 2 != 0) {
                                                                i9 = -(dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1));
                                                                i10 = ((-575) >>> i9) >> (-1);
                                                            } else {
                                                                i9 = -(dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1));
                                                                int i130 = i9 * (-575);
                                                                i10 = (i130 | (-26450)) + (i130 & (-26450));
                                                            }
                                                            int i131 = ~i9;
                                                            int i132 = -(-(576 * ((~((i131 & (-47)) | (i131 ^ (-47)))) | (~((((-47) & r1) == true ? 1 : 0) | (((-47) ^ r1) == true ? 1 : 0))))));
                                                            int i133 = (i10 ^ i132) + ((i10 & i132) << 1);
                                                            int i134 = ~i9;
                                                            int i135 = ~((i134 ^ 46) | (i134 & 46));
                                                            int i136 = (-47) | i82;
                                                            int i137 = ~((i136 ^ i9) | (i9 & i136));
                                                            int i138 = -(-(((i137 & i135) | (i135 ^ i137)) * 576));
                                                            Object[] objArr21 = new Object[1];
                                                            c(i128, cArr4, (byte) ((((i133 & i138) + (i138 | i133)) - (~((~((i134 ^ (-47)) | (i134 & (-47)))) * 576))) - 1), objArr21);
                                                            Class<?> cls6 = Class.forName((String) objArr21[0]);
                                                            Object[] objArr22 = new Object[1];
                                                            a(new int[]{175, 11, 156, 6}, false, new byte[]{1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1}, objArr22);
                                                            Object objInvoke4 = cls6.getMethod((String) objArr22[0], String.class).invoke(null, objArr20);
                                                            try {
                                                                int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                                                                int i139 = (scrollBarFadeDuration ^ 28) + ((scrollBarFadeDuration & 28) << 1);
                                                                char[] cArr5 = {22, '\f', 25, '\b', 14, '!', 27, 20, '!', 21, '\f', 4, '\n', '\f', 3, 18, 27, 5, 18, '!', '!', Typography.quote, '\f', 22, 4, 24, '\b', 7};
                                                                int i140 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                Object[] objArr23 = new Object[1];
                                                                c(i139, cArr5, (byte) ((i140 & 94) + (i140 | 94)), objArr23);
                                                                Class<?> cls7 = Class.forName((String) objArr23[0]);
                                                                int i141 = -Color.blue(0);
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i142 = i141 * (-949);
                                                                int i143 = (i142 ^ (-10439)) + ((i142 & (-10439)) << 1);
                                                                int i144 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                int i145 = ~((-12) | i144);
                                                                int i146 = i82;
                                                                int i147 = ~((~i141) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                                int i148 = -(-(((i145 ^ i147) | (i145 & i147)) * 1900));
                                                                int i149 = (i143 & i148) + (i148 | i143);
                                                                int i150 = ~((i144 ^ i141) | (i144 & i141));
                                                                int i151 = ~ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i152 = ~((i151 ^ 1246218425) | (i151 & 1246218425));
                                                                int i153 = -(-(((i152 ^ 19937094) | (i152 & 19937094)) * (-160)));
                                                                int i154 = (1478189297 & i153) + (1478189297 | i153);
                                                                int i155 = -(-(((~((1131511783 ^ i151) | (i151 & 1131511783))) | 1246218425) * 160));
                                                                int i156 = ((i154 | i155) << 1) - (i154 ^ i155);
                                                                int i157 = ~ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i158 = -(-((~((1196283823 ^ i157) | (1196283823 & i157) | 1224438434)) * (-783)));
                                                                int i159 = (((-359208271) | i158) << 1) - ((-359208271) ^ i158);
                                                                int i160 = ~((i157 ^ 1224438434) | (i157 & 1224438434));
                                                                int i161 = ((1196283823 & i160) | (1196283823 ^ i160)) * 783;
                                                                if (i156 <= ((i159 | i161) << 1) - (i159 ^ i161)) {
                                                                    int i162 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 11) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 11));
                                                                    int i163 = (-950) << ((i150 & i162) | (i150 ^ i162));
                                                                    int i164 = (i149 ^ i163) + ((i163 & i149) << 1);
                                                                    int i165 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | 11);
                                                                    int i166 = ~((i141 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i141 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                                                    int i167 = -((i165 & i166) | (i165 ^ i166));
                                                                    try {
                                                                        i11 = i164 % ((i167 ^ 950) + ((i167 & 950) << 1));
                                                                        cArr = new char[]{3, '\f', 29, 19, 6, '\f', 25, '\r', 6, 19, 13819};
                                                                        i12 = 49;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    int i168 = -(-((i150 | (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | 11))) * (-950)));
                                                                    int i169 = (i149 & i168) + (i168 | i149);
                                                                    int i170 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                    int i171 = ~((i170 & 11) | (i170 ^ 11));
                                                                    int i172 = ~(i141 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                                                    int i173 = ((i171 & i172) | (i171 ^ i172)) * 950;
                                                                    i11 = (i169 & i173) + (i173 | i169);
                                                                    cArr = new char[]{3, '\f', 29, 19, 6, '\f', 25, '\r', 6, 19, 13819};
                                                                    i12 = 25;
                                                                }
                                                                int i174 = b;
                                                                int i175 = (i174 & 121) + (i174 | 121);
                                                                TuitionPaymentFragmentbindingInflater1 = i175 % 128;
                                                                int i176 = i175 % 2;
                                                                int i177 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i178 = ~i12;
                                                                ?? r24 = r5;
                                                                int i179 = ~i177;
                                                                int i180 = ~((i179 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i179 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                int i181 = (i177 * 319) + (i12 * (-317)) + (((i178 ^ i180) | (i180 & i178)) * (-318));
                                                                int i182 = ~((i178 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i178 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                int i183 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | i177;
                                                                int i184 = ((~((i183 ^ i12) | (i183 & i12))) | i182) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                                                int i185 = (i181 ^ i184) + ((i184 & i181) << 1);
                                                                int i186 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                                                int i187 = ~((i186 & i178) | (i178 ^ i186) | i177);
                                                                int i188 = (i12 & i177) | (i177 ^ i12);
                                                                int i189 = ~((i188 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i188 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                                                int i190 = ((i187 & i189) | (i187 ^ i189)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                                                byte b4 = (byte) ((i185 & i190) + (i190 | i185));
                                                                try {
                                                                    r5 = new Object[1];
                                                                    c(i11, cArr, b4, r5);
                                                                    r1 = 0;
                                                                    try {
                                                                        try {
                                                                            r1 = new Object[]{new ByteArrayInputStream((byte[]) cls7.getMethod((String) r5[0], null).invoke(obj, null))};
                                                                            int i191 = -View.MeasureSpec.getSize(0);
                                                                            int i192 = (i191 ^ 37) + ((i191 & 37) << 1);
                                                                            char[] cArr6 = {6, 20, '\f', 23, 22, '\t', '\t', 24, 25, '\n', 30, 2, 18, 22, 24, '\t', 6, 1, 18, 27, 7, '\b', 2, 30, 2, Typography.quote, 24, 21, 6, '\f', 21, 19, 24, 3, '\r', '\t', 13841};
                                                                            int i193 = TuitionPaymentFragmentbindingInflater1;
                                                                            int i194 = (i193 ^ 67) + ((i193 & 67) << 1);
                                                                            b = i194 % 128;
                                                                            int i195 = i194 % 2;
                                                                            Object[] objArr24 = new Object[1];
                                                                            c(i192, cArr6, (byte) (Color.argb(0, 0, 0, 0) + 46), objArr24);
                                                                            Class<?> cls8 = Class.forName((String) objArr24[0]);
                                                                            int iLastIndexOf = TextUtils.lastIndexOf("", '0');
                                                                            int i196 = b + 113;
                                                                            TuitionPaymentFragmentbindingInflater1 = i196 % 128;
                                                                            int i197 = i196 % 2;
                                                                            int i198 = -iLastIndexOf;
                                                                            r5 = 18;
                                                                            r5 = 18;
                                                                            r5 = 18;
                                                                            int i199 = (18 & i198) + (i198 | 18);
                                                                            char[] cArr7 = {30, '\t', '\f', '\n', 6, 19, 6, '\f', 30, '\f', 6, 1, Typography.quote, 2, '!', 26, 24, 6, 13940};
                                                                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                            int i200 = TuitionPaymentFragmentbindingInflater1 + 63;
                                                                            b = i200 % 128;
                                                                            if (i200 % 2 == 0) {
                                                                                i13 = ((-661) >> iIndexOf) * (-71);
                                                                            } else {
                                                                                int i201 = iIndexOf * (-661);
                                                                                i13 = ((i201 | (-77998)) << 1) - (i201 ^ (-77998));
                                                                            }
                                                                            int i202 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                                                            int i203 = ~iIndexOf;
                                                                            int i204 = 1324 * (i202 | (~((i203 ^ (-119)) | (i203 & (-119)))));
                                                                            int i205 = (i13 & i204) + (i13 | i204);
                                                                            int i206 = ~(iIndexOf | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                                                                            int i207 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 118) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ 118));
                                                                            int i208 = i205 + (((i207 & i206) | (i206 ^ i207)) * (-1324));
                                                                            int i209 = ~((i203 ^ 118) | (i203 & 118));
                                                                            int i210 = ~((iIndexOf & (-119)) | ((-119) ^ iIndexOf));
                                                                            int i211 = -(-(((i210 & i209) | (i209 ^ i210)) * 662));
                                                                            Object[] objArr25 = new Object[1];
                                                                            c(i199, cArr7, (byte) ((i208 & i211) + (i211 | i208)), objArr25);
                                                                            Object objInvoke5 = cls8.getMethod((String) objArr25[0], InputStream.class).invoke(objInvoke4, r1);
                                                                            int i212 = TuitionPaymentFragmentbindingInflater1 + 71;
                                                                            b = i212 % 128;
                                                                            int i213 = i212 % 2;
                                                                            r1 = 34;
                                                                            r1 = 34;
                                                                            try {
                                                                                Object[] objArr26 = new Object[1];
                                                                                a(new int[]{186, 34, 0, 11}, true, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1}, objArr26);
                                                                                Class<?> cls9 = Class.forName((String) objArr26[0]);
                                                                                int i214 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                                int i215 = (i214 ^ 23) + ((i214 & 23) << 1);
                                                                                char[] cArr8 = {30, '\t', 6, 0, 29, '\n', '\t', 7, 24, 3, 7, 19, 13819, 13819, 31, '\n', Typography.quote, 14, 26, '!', 24, 23, 13895};
                                                                                int i216 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                Object[] objArr27 = new Object[1];
                                                                                c(i215, cArr8, (byte) (((i216 | 82) << 1) - (i216 ^ 82)), objArr27);
                                                                                if (!objNewInstance.equals(cls9.getMethod((String) objArr27[0], null).invoke(objInvoke5, null))) {
                                                                                    try {
                                                                                        Object[] objArr28 = new Object[1];
                                                                                        a(new int[]{186, 34, 0, 11}, true, new byte[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1}, objArr28);
                                                                                        Class<?> cls10 = Class.forName((String) objArr28[0]);
                                                                                        int i217 = -AndroidCharacter.getMirror('0');
                                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                        int i218 = (i217 * (-1975)) - (-70219);
                                                                                        int i219 = ~((~i217) | 71);
                                                                                        int i220 = -(-(((i219 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ i219)) * 988));
                                                                                        int i221 = (i218 ^ i220) + ((i218 & i220) << 1);
                                                                                        int i222 = ~(((-72) ^ i217) | ((-72) & i217));
                                                                                        int i223 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                        int i224 = ~(i223 | i217);
                                                                                        int i225 = (i221 - (~(-(-(((i222 & i224) | (i222 ^ i224)) * (-1976)))))) - 1;
                                                                                        int i226 = ~i217;
                                                                                        int i227 = (~((i226 & 71) | (i226 ^ 71))) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & (-72)) | ((-72) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)));
                                                                                        int i228 = ~(i223 | 71);
                                                                                        int i229 = i225 + (((i227 & i228) | (i227 ^ i228)) * 988);
                                                                                        char[] cArr9 = {30, '\t', 6, 0, 29, '\n', '\t', 7, 24, 3, 7, 19, 13819, 13819, 31, '\n', Typography.quote, 14, 26, '!', 24, 23, 13895};
                                                                                        int i230 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                        int i231 = i230 * 714;
                                                                                        int i232 = ((i231 | (-56960)) << 1) - (i231 ^ (-56960));
                                                                                        int i233 = ~i230;
                                                                                        int i234 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                                        int i235 = ~((i233 & i234) | (i233 ^ i234));
                                                                                        int i236 = ~i230;
                                                                                        int i237 = ~((i236 & 80) | (i236 ^ 80));
                                                                                        int i238 = (i235 & i237) | (i235 ^ i237);
                                                                                        int i239 = ((-81) & i230) | ((-81) ^ i230);
                                                                                        int i240 = ~((i239 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i239 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                                        int i241 = -(-(((i238 & i240) | (i238 ^ i240)) * (-713)));
                                                                                        int i242 = (((i232 | i241) << 1) - (i241 ^ i232)) + ((~((i230 & (-81)) | ((-81) ^ i230) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7)) * 1426);
                                                                                        int i243 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                                        Object[] objArr29 = new Object[1];
                                                                                        c(i229, cArr9, (byte) ((i242 - (~((~((i243 & (-81)) | ((-81) ^ i243))) * 713))) - 1), objArr29);
                                                                                        if (!objNewInstance2.equals(cls10.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                                            i89 = ((i89 & 9) + (i89 | 9)) - 8;
                                                                                            r1 = i;
                                                                                            i16 = i2;
                                                                                            objArr17 = objArr18;
                                                                                            length = i114;
                                                                                            i82 = i146;
                                                                                            r5 = r24 == true ? 1 : 0;
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        Throwable cause2 = th2.getCause();
                                                                                        if (cause2 != null) {
                                                                                            throw cause2;
                                                                                        }
                                                                                        throw th2;
                                                                                    }
                                                                                }
                                                                                r1 = i;
                                                                                int i244 = (~((r1 == true ? 1 : 0) & 1)) & ((r1 == true ? 1 : 0) | 1);
                                                                                try {
                                                                                    Object[] objArr30 = new Object[4];
                                                                                    int[] iArr2 = new int[1];
                                                                                    objArr30[0] = iArr2;
                                                                                    objArr30[1] = new int[1];
                                                                                    int[] iArr3 = new int[1];
                                                                                    objArr30[2] = iArr3;
                                                                                    int i245 = b + 101;
                                                                                    int i246 = i245 % 128;
                                                                                    TuitionPaymentFragmentbindingInflater1 = i246;
                                                                                    if (i245 % 2 != 0) {
                                                                                        iArr2[1] = r1 == true ? 1 : 0;
                                                                                        iArr3[0] = i244;
                                                                                    } else {
                                                                                        iArr2[0] = r1 == true ? 1 : 0;
                                                                                        iArr3[0] = i244;
                                                                                    }
                                                                                    objArr30[3] = null;
                                                                                    int i247 = (-1506010348) + ((~((r24 == true ? 1 : 0) | 1072268828)) * (-560)) + ((~(1072428639 | (r1 == true ? 1 : 0))) * (-560)) + (((~((r24 == true ? 1 : 0) | (-1031958600))) | 1031798788) * 560) + 16;
                                                                                    int i248 = i246 + 5;
                                                                                    b = i248 % 128;
                                                                                    int i249 = i248 % 2;
                                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                    int i250 = ((i247 * (-751)) - (~(-(-(i2 * (-751)))))) - 1;
                                                                                    int i251 = ~i247;
                                                                                    int i252 = TuitionPaymentFragmentbindingInflater1;
                                                                                    int i253 = i252 + 63;
                                                                                    b = i253 % 128;
                                                                                    if (i253 % 2 == 0) {
                                                                                        int i254 = ~i2;
                                                                                        int i255 = ~((i251 & i254) | (i251 ^ i254));
                                                                                        int i256 = ~i247;
                                                                                        int i257 = ~(i256 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                                                                                        int i258 = -((i255 & i257) | (i255 ^ i257));
                                                                                        i14 = i250 >> (((i258 | 1504) << 1) - (i258 ^ 1504));
                                                                                        i15 = i256 | i2;
                                                                                    } else {
                                                                                        int i259 = ~i2;
                                                                                        int i260 = ~((i259 & i251) | (i251 ^ i259));
                                                                                        int i261 = ~i247;
                                                                                        int i262 = ~((i261 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i261 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                                                        int i263 = ((i260 & i262) | (i260 ^ i262)) * 1504;
                                                                                        i14 = (i250 | i263) + (i250 & i263);
                                                                                        i15 = i251 | i2;
                                                                                    }
                                                                                    int i264 = i14 + ((-1504) * (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & i15) | (i15 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8))));
                                                                                    int i265 = ~i247;
                                                                                    int i266 = ~((i265 & i2) | (i265 ^ i2));
                                                                                    int i267 = ~(i247 | (~i2));
                                                                                    int i268 = ((i266 & i267) | (i266 ^ i267)) * 752;
                                                                                    int i269 = (i252 & 115) + (i252 | 115);
                                                                                    b = i269 % 128;
                                                                                    int i270 = i269 % 2;
                                                                                    int i271 = (i264 ^ i268) + ((i268 & i264) << 1);
                                                                                    int i272 = i271 << 13;
                                                                                    int i273 = (i272 | i271) & (~(i271 & i272));
                                                                                    int i274 = i273 >>> 17;
                                                                                    int i275 = (i273 | i274) & (~(i273 & i274));
                                                                                    int i276 = i275 << 5;
                                                                                    ((int[]) objArr30[1])[0] = ((~i275) & i276) | ((~i276) & i275);
                                                                                    return objArr30;
                                                                                } catch (Throwable unused) {
                                                                                    r5 = i2;
                                                                                    int[] iArr4 = new int[1];
                                                                                    int i277 = TuitionPaymentFragmentbindingInflater1;
                                                                                    int i278 = (i277 & 33) + (i277 | 33);
                                                                                    b = i278 % 128;
                                                                                    int i279 = i278 % 2;
                                                                                    int i280 = i277 + 111;
                                                                                    int i281 = i280 % 128;
                                                                                    b = i281;
                                                                                    int i282 = i280 % 2;
                                                                                    Object[] objArr31 = {new int[]{r1}, iArr4, new int[]{r1}, null};
                                                                                    int i283 = ~r1;
                                                                                    int i284 = (-1738029350) + ((r1 | 89119459) * (-859)) + (((~(89119459 | i283)) | (~(((-84351714) | r1) == true ? 1 : 0))) * 859) + (((~(48809230 | i283)) | (-133160944)) * 859);
                                                                                    int i285 = i284 * (-563);
                                                                                    int i286 = -(-(r5 * 565));
                                                                                    int i287 = (i285 & i286) + (i285 | i286);
                                                                                    int i288 = ~i284;
                                                                                    int i289 = ~r5;
                                                                                    int i290 = (~((i289 & i283) | (i289 ^ i283))) | i288;
                                                                                    int i291 = ~((r5 ^ r1) | (r5 & r1));
                                                                                    int i292 = ((i290 & i291) | (i290 ^ i291)) * (-564);
                                                                                    int i293 = ((i287 | i292) << 1) - (i292 ^ i287);
                                                                                    int i294 = r1 | ((i288 & r5) == true ? 1 : 0) | ((i288 ^ r5) == true ? 1 : 0);
                                                                                    int i295 = (i281 & 65) + (i281 | 65);
                                                                                    TuitionPaymentFragmentbindingInflater1 = i295 % 128;
                                                                                    int i296 = i295 % 2;
                                                                                    int i297 = 1128 * (i294 ^ (-1));
                                                                                    int i298 = (i293 ^ i297) + ((i297 & i293) << 1);
                                                                                    int i299 = ~i284;
                                                                                    int i300 = i298 + (((~((i299 & i283) | (i299 ^ i283))) | (~(((i284 ^ r5) == true ? 1 : 0) | (r5 & i284)))) * 564);
                                                                                    int i301 = i300 << 13;
                                                                                    int i302 = (i300 | i301) & (~(i300 & i301));
                                                                                    int i303 = i302 ^ (i302 >>> 17);
                                                                                    int i304 = i303 << 5;
                                                                                    iArr4[0] = ((~i303) & i304) | ((~i304) & i303);
                                                                                    return objArr31;
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                Throwable cause3 = th3.getCause();
                                                                                if (cause3 != null) {
                                                                                    throw cause3;
                                                                                }
                                                                                throw th3;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            Throwable cause4 = th4.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th4;
                                                                        }
                                                                    } catch (Throwable unused2) {
                                                                        r1 = i;
                                                                        r5 = i2;
                                                                        int[] iArr5 = new int[1];
                                                                        int i2710 = TuitionPaymentFragmentbindingInflater1;
                                                                        int i2711 = (i2710 & 33) + (i2710 | 33);
                                                                        b = i2711 % 128;
                                                                        int i2712 = i2711 % 2;
                                                                        int i2810 = i2710 + 111;
                                                                        int i2811 = i2810 % 128;
                                                                        b = i2811;
                                                                        int i2812 = i2810 % 2;
                                                                        Object[] objArr32 = {new int[]{r1}, iArr5, new int[]{r1}, null};
                                                                        int i2813 = ~r1;
                                                                        int i2814 = (-1738029350) + ((r1 | 89119459) * (-859)) + (((~(89119459 | i2813)) | (~(((-84351714) | r1) == true ? 1 : 0))) * 859) + (((~(48809230 | i2813)) | (-133160944)) * 859);
                                                                        int i2815 = i2814 * (-563);
                                                                        int i2816 = -(-(r5 * 565));
                                                                        int i2817 = (i2815 & i2816) + (i2815 | i2816);
                                                                        int i2818 = ~i2814;
                                                                        int i2819 = ~r5;
                                                                        int i2910 = (~((i2819 & i2813) | (i2819 ^ i2813))) | i2818;
                                                                        int i2911 = ~((r5 ^ r1) | (r5 & r1));
                                                                        int i2912 = ((i2910 & i2911) | (i2910 ^ i2911)) * (-564);
                                                                        int i2913 = ((i2817 | i2912) << 1) - (i2912 ^ i2817);
                                                                        int i2914 = r1 | ((i2818 & r5) == true ? 1 : 0) | ((i2818 ^ r5) == true ? 1 : 0);
                                                                        int i2915 = (i2811 & 65) + (i2811 | 65);
                                                                        TuitionPaymentFragmentbindingInflater1 = i2915 % 128;
                                                                        int i2916 = i2915 % 2;
                                                                        int i2917 = 1128 * (i2914 ^ (-1));
                                                                        int i2918 = (i2913 ^ i2917) + ((i2917 & i2913) << 1);
                                                                        int i2919 = ~i2814;
                                                                        int i305 = i2918 + (((~((i2919 & i2813) | (i2919 ^ i2813))) | (~(((i2814 ^ r5) == true ? 1 : 0) | (r5 & i2814)))) * 564);
                                                                        int i306 = i305 << 13;
                                                                        int i307 = (i305 | i306) & (~(i305 & i306));
                                                                        int i308 = i307 ^ (i307 >>> 17);
                                                                        int i309 = i308 << 5;
                                                                        iArr5[0] = ((~i308) & i309) | ((~i309) & i308);
                                                                        return objArr32;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                            }
                                                        } catch (Throwable th7) {
                                                            Throwable cause5 = th7.getCause();
                                                            if (cause5 != null) {
                                                                throw cause5;
                                                            }
                                                            throw th7;
                                                        }
                                                    } else {
                                                        r5 = i16;
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                Throwable cause6 = th8.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th8;
                                            }
                                        } catch (Throwable th9) {
                                            Throwable cause7 = th9.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th9;
                                        }
                                    } catch (Throwable th10) {
                                        Throwable cause8 = th10.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th10;
                                    }
                                } catch (Throwable th11) {
                                    Throwable cause9 = th11.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th11;
                                }
                            } catch (Throwable th12) {
                                Throwable cause10 = th12.getCause();
                                if (cause10 != null) {
                                    throw cause10;
                                }
                                throw th12;
                            }
                        } catch (Throwable unused3) {
                        }
                    } catch (Throwable unused4) {
                    }
                } else {
                    r5 = i16;
                }
                int[] iArr6 = new int[1];
                int i2713 = TuitionPaymentFragmentbindingInflater1;
                int i2714 = (i2713 & 33) + (i2713 | 33);
                b = i2714 % 128;
                int i2715 = i2714 % 2;
                int i28110 = i2713 + 111;
                int i28111 = i28110 % 128;
                b = i28111;
                int i28112 = i28110 % 2;
                Object[] objArr33 = {new int[]{r1}, iArr6, new int[]{r1}, null};
                int i28113 = ~r1;
                int i28114 = (-1738029350) + ((r1 | 89119459) * (-859)) + (((~(89119459 | i28113)) | (~(((-84351714) | r1) == true ? 1 : 0))) * 859) + (((~(48809230 | i28113)) | (-133160944)) * 859);
                int i28115 = i28114 * (-563);
                int i28116 = -(-(r5 * 565));
                int i28117 = (i28115 & i28116) + (i28115 | i28116);
                int i28118 = ~i28114;
                int i28119 = ~r5;
                int i29110 = (~((i28119 & i28113) | (i28119 ^ i28113))) | i28118;
                int i29111 = ~((r5 ^ r1) | (r5 & r1));
                int i29112 = ((i29110 & i29111) | (i29110 ^ i29111)) * (-564);
                int i29113 = ((i28117 | i29112) << 1) - (i29112 ^ i28117);
                int i29114 = r1 | ((i28118 & r5) == true ? 1 : 0) | ((i28118 ^ r5) == true ? 1 : 0);
                int i29115 = (i28111 & 65) + (i28111 | 65);
                TuitionPaymentFragmentbindingInflater1 = i29115 % 128;
                int i29116 = i29115 % 2;
                int i29117 = 1128 * (i29114 ^ (-1));
                int i29118 = (i29113 ^ i29117) + ((i29117 & i29113) << 1);
                int i29119 = ~i28114;
                int i3010 = i29118 + (((~((i29119 & i28113) | (i29119 ^ i28113))) | (~(((i28114 ^ r5) == true ? 1 : 0) | (r5 & i28114)))) * 564);
                int i3011 = i3010 << 13;
                int i3012 = (i3010 | i3011) & (~(i3010 & i3011));
                int i3013 = i3012 ^ (i3012 >>> 17);
                int i3014 = i3013 << 5;
                iArr6[0] = ((~i3013) & i3014) | ((~i3014) & i3013);
                return objArr33;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$c(byte r6, int r7, short r8) {
                /*
                    int r7 = r7 + 99
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    byte[] r0 = com.google.android.material.datepicker.MaterialCalendar.AnonymousClass8.$$a
                    int r6 = r6 * 3
                    int r1 = r6 + 1
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L28
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    r3 = r0[r8]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L28:
                    int r7 = r7 + r8
                    int r8 = r3 + 1
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MaterialCalendar.AnonymousClass8.$$c(byte, int, short):java.lang.String");
            }
        });
        this.monthNext.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    int iFindFirstVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
                    if (iFindFirstVisibleItemPosition < MaterialCalendar.this.recyclerView.getAdapter().getItemCount()) {
                        MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindFirstVisibleItemPosition));
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        this.monthPrev.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    int iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition() - 1;
                    if (iFindLastVisibleItemPosition >= 0) {
                        MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindLastVisibleItemPosition));
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
    }

    private void postSmoothRecyclerViewScroll(final int i) {
        this.recyclerView.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.recyclerView.smoothScrollToPosition(i);
            }
        });
    }

    private static int getDialogPickerHeight(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding);
        return dimensionPixelSize + dimensionPixelOffset + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height) + (MonthAdapter.MAXIMUM_WEEKS * resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + ((MonthAdapter.MAXIMUM_WEEKS - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final boolean addOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }
}
