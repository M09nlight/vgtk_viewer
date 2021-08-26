package by.vgtk.mvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping(value = { "/index" }, method = { RequestMethod.POST, RequestMethod.GET })
    public String messages(Model model) {

//        @AllArgsConstructor
//        class DirAndSize{
//            @Getter String dirName;
//            @Getter int size;
//            @Getter @Setter List<Integer> listOfNumbers;
//            @Getter @Setter int counter = 0;
//            @Getter @Setter boolean isAvailable = true;
//            
//            public DirAndSize(String dirName, int size) {
//                this.dirName = dirName;
//                this.size = size;
//                listOfNumbers = fillTheArray(size);
//            }
//            
//            public List<Integer> fillTheArray(int bound) {
//                return IntStream.range(0, bound).map(number -> number + 1).boxed().collect(Collectors.toList());
//            }
//        }
//        
//        List<DirAndSize> listDirAndSizes = List.of(
//                new DirAndSize("achievements", 21),
//                new DirAndSize("brsm", 16),
//                new DirAndSize("construction", 28),
//                new DirAndSize("ideological", 44),
//                new DirAndSize("military", 20),
//                new DirAndSize("mkc", 27),
//                new DirAndSize("sport", 38),
//                new DirAndSize("WorldSkills", 30)
//                );
//        
//        int sizeFor=0;
//        for(DirAndSize das:listDirAndSizes) {
//            Collections.shuffle(das.listOfNumbers);
//            sizeFor+=das.size;
//        }
//        
//        //рандомное число с названием папки 
//        //по названию папки получаем размер
//        //по размеру берём рандомное число 
//        //и добавляем элементы в мап и лист 
//        
//        List<Map<String, Integer>> listOfMaps = new ArrayList<Map<String, Integer>>();
//        
//        //проходим столько раз сколько и фотографий, если этот массив мы уже прошли, то ставим, что он не доступен и итерацию не считаем
//        for (int i = 0; i < sizeFor; i++) {
//            int firstRandNumber = 0 + (int) (Math.random() * 8); // random dir
//            
//            if(listDirAndSizes.get(firstRandNumber).isAvailable) {
//                listOfMaps.add(Map.of(listDirAndSizes.get(firstRandNumber).dirName,
//                        listDirAndSizes.get(firstRandNumber).listOfNumbers.get(listDirAndSizes.get(firstRandNumber).counter++)));
//                if(listDirAndSizes.get(firstRandNumber).counter == listDirAndSizes.get(firstRandNumber).size) {
//                    listDirAndSizes.get(firstRandNumber).isAvailable = false;
//                }
//            }else {
//                i--;
//            }
//        }
//        
//        model.addAttribute("listOfMaps",listOfMaps);
        System.out.println("index open");
        return "index";
    }
    
    
    
}
