public int dogWalksShift(int startHour, int endHour){
  int moneyEarned=0;
  for(int hour=startHour;hour <= endHour;hour++){
    if(Dogs == maxDogs || (hour >=9 && <=17)){
        moneyEarned +=3;
    }
  }
  return moneyEarned;
}
