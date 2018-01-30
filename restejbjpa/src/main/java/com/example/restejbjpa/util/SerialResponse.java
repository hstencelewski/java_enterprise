package com.example.restejbjpa.util;
import java.util.List;
import com.example.restejbjpa.domain.Serial;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SerialResponse {

    private List<Serial> serial;

    public List<Serial> getSerial() {
        return serial;
    }
    public void setSerial(List<Serial> serial) {
        this.serial = serial;
    }
}
