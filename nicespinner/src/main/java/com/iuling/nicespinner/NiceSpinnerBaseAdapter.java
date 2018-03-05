package com.iuling.nicespinner;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public abstract class NiceSpinnerBaseAdapter<T> extends BaseAdapter {

    private final SpinnerTextFormatter spinnerTextFormatter;

    private int textColor;
    private int backgroundSelector;
    private int itemGravity;
    int selectedIndex;

    NiceSpinnerBaseAdapter(Context context, int textColor, int backgroundSelector,
                           SpinnerTextFormatter spinnerTextFormatter,int itemGravity) {
        this.spinnerTextFormatter = spinnerTextFormatter;
        this.backgroundSelector = backgroundSelector;
        this.textColor = textColor;
        if (itemGravity <= 0)
            itemGravity = 17;
        this.itemGravity = itemGravity;

    }

    @Override public View getView(int position, @Nullable View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        TextView textView;

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.spinner_list_item, null);
            textView = convertView.findViewById(R.id.text_view_spinner);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                textView.setBackground(ContextCompat.getDrawable(context, backgroundSelector));
            }
            textView.setGravity(itemGravity);
            if (itemGravity == Gravity.LEFT){
                textView.setPadding(context.getResources().getDimensionPixelSize(R.dimen.three_grid_unit),
                        context.getResources().getDimensionPixelSize(R.dimen.one_and_a_half_grid_unit),
                        context.getResources().getDimensionPixelSize(R.dimen.one_and_a_half_grid_unit),
                        context.getResources().getDimensionPixelSize(R.dimen.one_and_a_half_grid_unit));
            }else if (itemGravity == Gravity.RIGHT){
                textView.setPadding(context.getResources().getDimensionPixelSize(R.dimen.three_grid_unit),
                        context.getResources().getDimensionPixelSize(R.dimen.one_and_a_half_grid_unit),
                        context.getResources().getDimensionPixelSize(R.dimen.one_and_a_half_grid_unit),
                        context.getResources().getDimensionPixelSize(R.dimen.three_grid_unit));
            }
            convertView.setTag(new ViewHolder(textView));
        } else {
            textView = ((ViewHolder) convertView.getTag()).textView;
        }

        textView.setText(spinnerTextFormatter.format(getItem(position).toString()));
        textView.setTextColor(textColor);
        return convertView;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    void setSelectedIndex(int index) {
        selectedIndex = index;
    }

    public abstract T getItemInDataset(int position);

    @Override public long getItemId(int position) {
        return position;
    }

    @Override public abstract T getItem(int position);

    @Override public abstract int getCount();

    static class ViewHolder {
        TextView textView;

        ViewHolder(TextView textView) {
            this.textView = textView;
        }
    }
}