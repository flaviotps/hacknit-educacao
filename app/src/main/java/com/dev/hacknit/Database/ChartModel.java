package com.dev.hacknit.Database;




import com.dev.hacknit.Helpers.Constants;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;
import java.util.List;

public class ChartModel {


    public String Data;
    public String Label;
    public int Type;
    public String Title;



    public int POSITION_X = 0;
    public int POSITION_VALUE = 1;
    public int POSITION_COLOR = 2;



    public ChartModel(String data, String label, int type, String title) {
        Data = data;
        Label = label;
        Type = type;
        Title = title;
    }

    public static String getPieChartLabel(String Label, int pos) {
        String[] splitedLabel = Label.split(",");

        if (splitedLabel[pos - 1] != null) {
            return splitedLabel[pos - 1];
        } else {
            return "";
        }
    }

    public static Float StringToFloat(String s) {
        s = s.replace(".", "");
        return Float.valueOf(s);

    }

    public int getChartType() {
        return Type;
    }


    public <T> List<T> getChartData() {

        List<T> entries = new ArrayList<T>();
        String[] DataArray = Data.split(";");

        for (int i = 0; i < DataArray.length; i++) {
            switch (Type) {

                case Constants.CHART_TYPE_BAR:
                    String[] BarInfo = DataArray[i].split(",");
                    float BarPos = Float.valueOf(BarInfo[POSITION_X]);
                    float BarValue = StringToFloat(BarInfo[POSITION_VALUE]);
                    entries.add((T) new BarEntry(BarPos, BarValue));
                    break;

                case Constants.CHART_TYPE_PIE:
                    String[] PieInfo = DataArray[i].split(",");
                    float PieTitlePos = Float.valueOf(PieInfo[POSITION_X]);
                    float PíeValue = StringToFloat(PieInfo[POSITION_VALUE]);
                    entries.add((T) new PieEntry(PíeValue, getPieChartLabel(Label, (int) PieTitlePos)));
                    break;
            }
        }
        return entries;
    }


}





