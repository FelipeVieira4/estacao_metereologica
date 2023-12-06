package Displays;

public class DisplayFactory {

  public StatisticsDisplay criarStatisticsDisplay(){
    return new StatisticsDisplay();
  }

  public CurrentConditionsDisplay criarConditionsDisplay (){
    return new CurrentConditionsDisplay();
  }
}
