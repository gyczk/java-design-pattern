package com.simplefanc.design.structural.adapter.ACToDC;

/**
 * 电源适配器
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int outputDC5() {
        int adapterInput = super.outputAC220();

        //将220V的交流电转为5V的直流电
        int adapterOutput = adapterInput / 44;
        System.out.println("将" + adapterInput + "V的交流电转为 " + adapterOutput + "V的直流电");
        return adapterOutput;
    }
}
