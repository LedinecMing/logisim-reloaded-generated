package modules.workenvironment;
import modules.methods.DrawMethods;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Stroke;
import java.awt.BasicStroke;
public class DrawComponent {
    public DrawComponent(Component component, Graphics graphics){
        DrawComponentBody(component, graphics);
        DrawComponentPort(component, graphics);
    }
    private void DrawComponentBody(Component component, Graphics graphics){
        if (component.getDrawOder().size() == 0){
            for (Object[] linedata : component.getLineData()){
                drawline(component, graphics, linedata);
            }
            for (Object[] rectdata : component.getRectData()){
                if (rectdata[0].equals("in-out")){
                    fillrect(component, graphics, rectdata);
                    drawrect(component, graphics, rectdata);
                } else if (rectdata[0].equals("in")){
                    fillrect(component, graphics, rectdata);
                } else{
                    drawrect(component, graphics, rectdata);
                }
            }
            for (Object[] ovaldata : component.getOvalData()){
                if (ovaldata[0].equals("in-out")){
                    filloval(component, graphics, ovaldata);
                    drawoval(component, graphics, ovaldata);
                } else if (ovaldata[0].equals("in")){
                    filloval(component, graphics, ovaldata);
                } else{
                    drawoval(component, graphics, ovaldata); 
                }
            }
            //продолжить в определенном порядке
        } else {
            int line = 0;
            int rect = 0;
            int oval = 0;
            int poly = 0;
            int text = 0;
            for (String data : component.getDrawOder()){
                if (data.equals("Line")){
                    drawline(component, graphics, component.getLineData().get(line));
                    line++;
                } else if (data.equals("Rect")){
                    Object[] tmp = component.getLineData().get(rect);
                    if (tmp[0].equals("in-out")){
                        fillrect(component, graphics, tmp);
                        drawrect(component, graphics, tmp);
                    } else if (tmp[0].equals("in")){
                        fillrect(component, graphics, tmp);
                    } else{
                        drawrect(component, graphics, tmp);
                    }
                    rect++;
                } else if (data.equals("Oval")){
                    Object[] tmp = component.getOvalData().get(oval);
                    if (tmp[0].equals("in-out")){
                        filloval(component, graphics, tmp);
                        drawoval(component, graphics, tmp);
                    } else if (tmp[0].equals("in")){
                        filloval(component, graphics, tmp);
                    } else{
                        drawoval(component, graphics, tmp); 
                    }
                    oval++;
                } else if (data.equals("Poly")){
                    Object[] tmp = component.getPolyData().get(poly);
                    if (tmp[0].equals("in-out")){
                        //
                    } else if (tmp[0].equals("in")){
                        //
                    } else{
                        //
                    }
                    poly++;
                } else if (data.equals("Text")) {
                    Object[] tmp = component.getTextData().get(text);
                    //
                    text++;
                } else {
                    //вывод ошибки
                }
                //продолжить
            }
        }
    }
    //доделать
    private void DrawComponentPort(Component component, Graphics graphics){
        int[] location = new int[] {Math.round(component.getComponentLocation()[0] * WorkEnvironmentMain.Scale), Math.round(component.getComponentLocation()[1] * WorkEnvironmentMain.Scale)};
        for (Port port : component.getPorts()){
            int[] portlocation = new int[] {Math.round((port.location[0] * (float) Math.cos(-Math.toRadians(component.getRotation())) - port.location[1] * (float) Math.sin(-Math.toRadians(component.getRotation()))) * WorkEnvironmentMain.Scale - WorkEnvironmentMain.Scale * 1.5F), Math.round((port.location[0] * (float) Math.sin(-Math.toRadians(component.getRotation())) + port.location[1] * (float) Math.cos(-Math.toRadians(component.getRotation()))) * WorkEnvironmentMain.Scale - WorkEnvironmentMain.Scale * 1.5F)};
            int radius = Math.round(3 * WorkEnvironmentMain.Scale);
            fillport(graphics, location, portlocation, radius, port.color);
            //доделать поворот порта
        }
    }
    //отрисовка тела компонента
    //доделать зависимость stroke (line width) от Scale
    private void drawline(Component component, Graphics graphics, Object[] LineData){
        int arg1 = Math.round(((int) LineData[0] * (float) Math.cos(Math.toRadians(component.getRotation())) + (int) LineData[1] * (float) Math.sin(Math.toRadians(component.getRotation()))) * WorkEnvironmentMain.Scale);
        int arg2 = Math.round(((int) LineData[0] * (float) Math.sin(Math.toRadians(component.getRotation())) - (int) LineData[1] * (float) Math.cos(Math.toRadians(component.getRotation()))) * WorkEnvironmentMain.Scale);
        int arg3 = Math.round(((int) LineData[2] * (float) Math.cos(Math.toRadians(component.getRotation())) + (int) LineData[3] * (float) Math.sin(Math.toRadians(component.getRotation()))) * WorkEnvironmentMain.Scale);
        int arg4 = - Math.round(((int) LineData[2] * (float) Math.sin(Math.toRadians(component.getRotation())) - (int) LineData[3] * (float) Math.cos(Math.toRadians(component.getRotation()))) * WorkEnvironmentMain.Scale);
        int[] location = new int[] {Math.round(component.getComponentLocation()[0] * WorkEnvironmentMain.Scale), Math.round(component.getComponentLocation()[1] * WorkEnvironmentMain.Scale)};
        Stroke stroke = new BasicStroke(((BasicStroke) LineData[5]).getLineWidth() * WorkEnvironmentMain.Scale, ((BasicStroke) LineData[5]).getEndCap(), ((BasicStroke) LineData[5]).getLineJoin(), ((BasicStroke) LineData[5]).getMiterLimit(), ((BasicStroke) LineData[5]).getDashArray(), ((BasicStroke) LineData[5]).getDashPhase());
        (new DrawMethods()).drawLine(graphics, location, arg1, -arg2, arg3, arg4, (Color) LineData[4], stroke);
    }
    private void drawrect(Component component, Graphics graphics, Object[] RectData){
        int arg1 = Math.round(((int) RectData[1] * (float) Math.cos(Math.toRadians(component.getRotation())) - (int) RectData[2] * (float) Math.sin(Math.toRadians(component.getRotation()))) * WorkEnvironmentMain.Scale);
        int arg2 = Math.round(((int) RectData[1] * (float) Math.sin(Math.toRadians(component.getRotation())) + (int) RectData[2] * (float) Math.cos(Math.toRadians(component.getRotation()))) * WorkEnvironmentMain.Scale);
        int[] location = new int[] {Math.round(component.getComponentLocation()[0] * WorkEnvironmentMain.Scale), Math.round(component.getComponentLocation()[1] * WorkEnvironmentMain.Scale)};
        Stroke stroke = new BasicStroke(((BasicStroke) RectData[6]).getLineWidth() * WorkEnvironmentMain.Scale, ((BasicStroke) RectData[6]).getEndCap(), ((BasicStroke) RectData[6]).getLineJoin(), ((BasicStroke) RectData[6]).getMiterLimit(), ((BasicStroke) RectData[6]).getDashArray(), ((BasicStroke) RectData[6]).getDashPhase());
        (new DrawMethods()).drawRect(graphics, location, arg1, arg2, Math.round((int) RectData[3] * WorkEnvironmentMain.Scale), Math.round((int) RectData[4] * WorkEnvironmentMain.Scale), (Color) RectData[5], stroke, component.getRotation());
    }
    private void fillrect(Component component, Graphics graphics, Object[] RectData){
        int arg1 = (int) ((int) RectData[1] * Math.cos(Math.toRadians(component.getRotation())) * WorkEnvironmentMain.Scale - (int) RectData[2] * Math.sin(Math.toRadians(component.getRotation())) * WorkEnvironmentMain.Scale);
        int arg2 = (int) ((int) RectData[1] * Math.sin(Math.toRadians(component.getRotation())) * WorkEnvironmentMain.Scale + (int) RectData[2] * Math.cos(Math.toRadians(component.getRotation())) * WorkEnvironmentMain.Scale);
        int[] location = new int[] {Math.round(component.getComponentLocation()[0] * WorkEnvironmentMain.Scale), Math.round(component.getComponentLocation()[1] * WorkEnvironmentMain.Scale)};
        (new DrawMethods()).fillRect(graphics, location, arg1, arg2,  Math.round((int) RectData[3] * WorkEnvironmentMain.Scale),  Math.round((int) RectData[4] * WorkEnvironmentMain.Scale), (Color) RectData[5], component.getRotation());
    }
    private void drawoval(Component component, Graphics graphics, Object[] OvalData){
        int arg1 = (int) ((int) OvalData[1] * (float) Math.cos(Math.toRadians(component.getRotation())) - (int) OvalData[2] * Math.sin(Math.toRadians(component.getRotation())));
        int arg2 = (int) ((int) OvalData[1] * Math.sin(Math.toRadians(component.getRotation())) + (int) OvalData[2] * Math.cos(Math.toRadians(component.getRotation())));
        int[] location = new int[] {Math.round(component.getComponentLocation()[0] * WorkEnvironmentMain.Scale), Math.round(component.getComponentLocation()[1] * WorkEnvironmentMain.Scale)};
        Stroke stroke = new BasicStroke(((BasicStroke) OvalData[6]).getLineWidth() * WorkEnvironmentMain.Scale, ((BasicStroke) OvalData[6]).getEndCap(), ((BasicStroke) OvalData[6]).getLineJoin(), ((BasicStroke) OvalData[6]).getMiterLimit(), ((BasicStroke) OvalData[6]).getDashArray(), ((BasicStroke) OvalData[6]).getDashPhase());
        (new DrawMethods()).drawOval(graphics, location, arg1, arg2, Math.round((int) OvalData[3] * WorkEnvironmentMain.Scale), Math.round((int) OvalData[4] * WorkEnvironmentMain.Scale), (Color) OvalData[5], stroke, component.getRotation());
    }
    private void filloval(Component component, Graphics graphics, Object[] OvalData){
        int arg1 = (int) ((int) OvalData[1] * Math.cos(Math.toRadians(component.getRotation())) - (int) OvalData[2] * Math.sin(Math.toRadians(component.getRotation())));
        int arg2 = (int) ((int) OvalData[1] * Math.sin(Math.toRadians(component.getRotation())) + (int) OvalData[2] * Math.cos(Math.toRadians(component.getRotation())));
        int[] location = new int[] {Math.round(component.getComponentLocation()[0] * WorkEnvironmentMain.Scale), Math.round(component.getComponentLocation()[1] * WorkEnvironmentMain.Scale)};
        (new DrawMethods()).fillOval(graphics, location, arg1, arg2,  Math.round((int) OvalData[3] * WorkEnvironmentMain.Scale), Math.round((int) OvalData[4] * WorkEnvironmentMain.Scale), (Color) OvalData[5], component.getRotation());
    }
    //отрисовка порта
    private void fillport(Graphics graphics, int[] location, int[] portlocation, int radius, Color portcolor){
        (new DrawMethods()).fillOval(graphics, location, portlocation[0], portlocation[1], radius, radius, portcolor, 0);
    };
}
