package com.example.ksoapteste2.objetos2;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 6/11/2014 4:40:07 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class ConsultaDoctoOUT implements KvmSerializable {
    
    public VectorField listFieldOUT;
    public Retorno retornoProcesso;
    
    public ConsultaDoctoOUT(){}
    
    public ConsultaDoctoOUT(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("ListFieldOUT"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("ListFieldOUT");
            listFieldOUT = new VectorField(j);
        }
        if (soapObject.hasProperty("RetornoProcesso"))
        {
            SoapObject j = (SoapObject)soapObject.getProperty("RetornoProcesso");
            retornoProcesso =  new Retorno (j);
            
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return listFieldOUT;
            case 1:
                return retornoProcesso;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 2;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.VECTOR_CLASS;
                info.name = "ListFieldOUT";
                break;
            case 1:
                info.type = Retorno.class;
                info.name = "RetornoProcesso";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
