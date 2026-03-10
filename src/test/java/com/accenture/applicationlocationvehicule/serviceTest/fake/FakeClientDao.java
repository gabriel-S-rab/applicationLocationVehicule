package com.accenture.applicationlocationvehicule.serviceTest.fake;

import com.accenture.applicationlocationvehicule.exception.ClientException;
import com.accenture.applicationlocationvehicule.repository.ClientDao;
import com.accenture.applicationlocationvehicule.repository.entity.Adress;
import com.accenture.applicationlocationvehicule.repository.entity.Client;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;



public class FakeClientDao implements ClientDao {



    private final Map<Long , Client> store = new HashMap<>();
    private  PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    @Override
    public Optional<Client> findByEmail(String email){
        List<String> listOfLiccense = new ArrayList<>();
        listOfLiccense.add("A");
        listOfLiccense.add("B");
        Date dateToday = new Date();
        SimpleDateFormat dateForma = new SimpleDateFormat("EEE dd MMM yyyy HH:mm:ss");
        String stringDateFormat = dateForma.format(dateToday);
        Adress adress =new Adress("rue de la paix","paris","7500");
        Client client1 = new Client();
        Long a = Integer.toUnsignedLong(1);
        client1.setId(a);
        client1.setDateOfBirth("21/02/1993");
        client1.setDesactivated(false);
        client1.setListOfLicenses(listOfLiccense);
        client1.setRegistrationDate(stringDateFormat);
        client1.setPassword(passwordEncoder.encode("password"));
        client1.setEmail("test@test.com");
        client1.setAdress(adress);
        client1.setFirstName("roger");
        client1.setLastName("robert");
        store.put(a,client1);
        if(client1 == null)
            throw new ClientException("le client est null "+client1.toString());
        for(Client client : store.values()){
         if(client.getEmail() != null && client.getEmail().equals(email))
             return Optional.of(client);
      }
        throw new ClientException("erreur lors dans le fakeClientDao");
       // return Optional.empty();
    }



    @Override
    public void flush() {

    }



    @Override
    public <S extends Client> S saveAndFlush(S entity) {
       store.put(entity.getId(), entity);
       return entity;
    }


    @Override
    public <S extends Client> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }



    @Override
    public void deleteAllInBatch(Iterable<Client> entities) {

    }


    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Client getOne(Long aLong) {
        return null;
    }

    @Override
    public Client getById(Long aLong) {
        return null;
    }

    @Override
    public Client getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Client> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Client> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Client> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Client> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Client> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Client> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Client, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Client> S save(S entity) {
        store.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public <S extends Client> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Client> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Client> findAll() {
        return List.of();
    }

    @Override
    public List<Client> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Client entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Client> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Client> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Client> findAll(Pageable pageable) {
        return null;
    }
}
