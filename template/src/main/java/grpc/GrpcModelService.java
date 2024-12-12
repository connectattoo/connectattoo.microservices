package grpc;

import com.connectattoo.PeopleReq;
import com.connectattoo.PeopleResp;
import com.connectattoo.PeopleServiceGrpc;
import com.microservice.UserModel;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Optional;

@GrpcService
public class GrpcModelService extends PeopleServiceGrpc.PeopleServiceImplBase {
    @Override
    public void getPeople(PeopleReq request, StreamObserver<PeopleResp> responseObserver) {
        UserModel.getPeopleFromDb().stream()
                .filter(usr -> usr.getId() == request.getId())
                        .findFirst()
                .ifPresent(v -> responseObserver.onNext(convertToPeopleRes(v)));
        responseObserver.onCompleted();
    }

    private PeopleResp convertToPeopleRes (PeopleReq peopleReq) {
        PeopleResp.Builder builder = PeopleResp.newBuilder();
        builder.setAge(peopleReq.getAge());
        builder.setName(peopleReq.getName());
        return builder.build();
    }
}
